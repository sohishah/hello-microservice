package com.ibm.cloud;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/java/microservice")
@Produces(MediaType.APPLICATION_JSON)
public class HelloMicroService 
{
    private final String defaultName;
    private final AtomicLong counter;

    public HelloMicroService(String defaultName) 
    {
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello() 
    {
        final String value = this.defaultName;
        return new Saying(counter.incrementAndGet(), value);
    }
}
