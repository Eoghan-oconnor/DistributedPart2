package ie.gmit.ds;

import java.util.concurrent.TimeUnit;

import java.util.logging.*;

import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;

import ie.gmit.ds.PasswordServiceGrpc.PasswordServiceBlockingStub;
import ie.gmit.ds.PasswordServiceGrpc.PasswordServiceStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class Client {
	
	//Declaration
	private final ManagedChannel channel;
	private final PasswordServiceStub asyncService;
	private final PasswordServiceBlockingStub syncService;
	private ByteString expectedHash;
	private ByteString salt;
	private static final Logger logger = Logger.getLogger(Client.class.getName());
	
	//Client constructor
	public Client(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host,port).usePlaintext().build();
		
		syncService = PasswordServiceGrpc.newBlockingStub(channel);
		asyncService = PasswordServiceGrpc.newStub(channel);
	}
	
	public void shutdown() throws InterruptedException{
		channel.shutdown().awaitTermination(10, TimeUnit.SECONDS);
	}
	
	// getters 
	public ByteString getExpectedHash() {
		return expectedHash;
	}
	
	public ByteString getSalt() {
		return salt;
	}
	
	
	public void hash(int userId, String password) {
		
		StreamObserver<HashResponse> hr = new StreamObserver<HashResponse>() {
			
			@Override
			public void onNext(HashResponse value) {
				// TODO Auto-generated method stub
				salt = value.getSalt();
				expectedHash = value.getHashedPassword();
				
			}
			
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}
		};
		
		try {
			logger.info("Getting items");
			HashRequest hrq = HashRequest.newBuilder().setUserID(userId).setPassword(password).build();
			asyncService.hash(hrq, hr);
			TimeUnit.SECONDS.sleep(10);
		}catch (Exception e) {
			// TODO: handle exception
			return;
		}
		return;
	}
	
	public boolean validate(ByteString hash, ByteString salt, String password) {
		
		try {
			BoolValue value = syncService.validate(ValidateRequest.newBuilder().setHashedPassword(hash).setSalt(salt).setPassword(password).build());
			return value.getValue();
		}catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}
	

}
