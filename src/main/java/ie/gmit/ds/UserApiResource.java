package ie.gmit.ds;

import java.util.HashMap;

import javax.validation.Validator;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Adapted from: https://howtodoinjava.com/dropwizard/tutorial-and-hello-world-example/
@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserApiResource {
	
	
	private Client client;
	private final Validator validator;
	
	private final String host = "localhost";
	private final int port = 9999;
	
	public UserApiResource(Validator validator) {
		this.validator = validator;
		this.client = new Client(host, port);
		
		
	}
	
	
	
	
	
	

}
