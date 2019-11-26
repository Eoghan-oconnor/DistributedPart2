package ie.gmit.ds;

import io.dropwizard.*;
import io.dropwizard.setup.Environment;

//this class is used to wire them into a dropwizard application
// adapted from https://github.com/john-french/artistAPI-dropwizard

public class UserApiApplication extends Application<UserApiConfig> {
	
	public static void main(String[] args) throws Exception{
		new UserApiApplication().run(args);
		
	}

	@Override
	public void run(UserApiConfig configuration, Environment environment) throws Exception {
		
		final ExampleHealthCheck hc = new ExampleHealthCheck();
		environment.healthChecks().register("Example", hc);
		
		final UserApiResource resource = new UserApiResource();
		
		environment.jersey().register(resource);

	}

}
