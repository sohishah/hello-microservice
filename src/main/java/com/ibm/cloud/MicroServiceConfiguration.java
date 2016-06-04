package com.ibm.cloud;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

public class MicroServiceConfiguration extends Configuration
{
    @NotEmpty
    private String defaultName = "/java/microservice";

    
    @JsonProperty
    public String getDefaultName() 
    {
        return defaultName;
    }

    @JsonProperty
    public void setDefaultName(String name) 
    {
        this.defaultName = name;
    }
}
