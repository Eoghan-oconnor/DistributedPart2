package ie.gmit.ds;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

//	this class is used to wire them into a dropwizard application
// adapted from https://github.com/john-french/artistAPI-dropwizard
// adapted from https://howtodoinjava.com/dropwizard/tutorial-and-hello-world-example/

public class UserApiApplication extends Application<UserApiConfig> {
	
	public static final Logger logger = LoggerFactory.getLogger(UserApiApplication.class);
	
	public static void main(String[] args) throws Exception{
		new UserApiApplication().run(args);
		
	}

	@Override
	public void run(UserApiConfig configuration, Environment environment) throws Exception {
		
		final ExampleHealthCheck hc = new ExampleHealthCheck();
		//environment.healthChecks().register("Example", hc);
		
		logger.info("Getting REST resources");
		environment.jersey().register(new UserApiResource(environment.getValidator()));
		//final UserApiResource resource = new UserApiResource();
		environment.healthChecks().register("Health Check", new ExampleHealthCheck());
		
		//environment.jersey().register(resource);

	}

}