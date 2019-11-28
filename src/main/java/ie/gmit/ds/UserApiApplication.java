package ie.gmit.ds;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

//this class is used to wire them into a dropwizard application
// adapted from https://github.com/john-french/artistAPI-dropwizard

public class UserApiApplication extends Application<UserApiConfig> {
	
	public static final Logger logger = LoggerFactory.getLogger(UserApiApplication.class);
	
	public static void main(String[] args) throws Exception{
		new UserApiApplication().run(args);
		
	}

	@Override
	public void run(UserApiConfig configuration, Environment environment) throws Exception {
		
		final ExampleHealthCheck hc = new ExampleHealthCheck();
		environment.healthChecks().register("Example", hc);
		
		logger.info("Getting REST resources");
		
		final UserApiResource resource = new UserApiResource();
		
		environment.jersey().register(resource);

	}

}