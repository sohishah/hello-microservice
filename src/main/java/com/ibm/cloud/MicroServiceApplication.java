package com.ibm.cloud;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MicroServiceApplication extends Application<MicroServiceConfiguration>
{
	@Override
	public void run(MicroServiceConfiguration configuration, Environment environment) throws Exception 
	{
		final HelloMicroService resource = new HelloMicroService(configuration.getDefaultName());
		environment.jersey().register(resource);
		
		final MicroServiceHealthCheck healthCheck = new MicroServiceHealthCheck();
		environment.healthChecks().register("/java/microservice", healthCheck);
	}
	
    @Override
    public String getName() 
    {
        return "/java/microservice";
    }

    @Override
    public void initialize(Bootstrap<MicroServiceConfiguration> bootstrap) 
    {
    	
    }
    
    public static void main(String[] args) throws Exception 
    {
        new MicroServiceApplication().run(args);
    }
}
