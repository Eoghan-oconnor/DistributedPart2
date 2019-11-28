package ie.gmit.ds;

import javax.validation.Validator;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

}
