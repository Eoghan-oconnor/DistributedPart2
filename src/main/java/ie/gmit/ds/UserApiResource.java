package ie.gmit.ds;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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

	public UserApiResource(Validator validator, Client client) {
		this.validator = validator;
		this.client = client;
	}
	
	@GET
	public Response getUsers() {
		// Returns all users.
		return Response.ok(UserDb.getUsers()).build();
	}
	
	@GET
	@Path("/{user_id}")
	public Response getUserById(@PathParam("userId") Integer id ) {
		
		User user = UserDb.getUser(id);
		if(user != null) {
			return Response.ok(user).build();
		}else {
			return Response.status(Status.NOT_FOUND).build();
		}
		
	}
	
	@POST
	public Response create(User user) throws URISyntaxException	{
		 Set<ConstraintViolation<User>> violations = validator.validate(user);
	        User u = UserDb.getUser(user.getUserId());
	        if (violations.size() > 0) {
	            ArrayList<String> validationMessages = new ArrayList<String>();
	            for (ConstraintViolation<User> violation : violations) {
	                validationMessages.add(violation.getPropertyPath().toString() + ": " + violation.getMessage());
	            }
	            return Response.status(Response.Status.BAD_REQUEST).entity(validationMessages).build();
	        }
	        if (u == null) {
	            //client.hash(userId, password);;
	            UserDb.create(user.getUserId(), user);

	            return Response.created(new URI("/users/" + user.getUserId()))
	                    .build();
	        } else
	            return Response.status(Status.NOT_FOUND).build();

	    }

}
