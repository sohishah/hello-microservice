package com.ibm.cloud;

import com.codahale.metrics.health.HealthCheck;

public class MicroServiceHealthCheck extends HealthCheck 
{
    public MicroServiceHealthCheck() 
    {
    }

    @Override
    protected Result check() throws Exception 
    {
        return Result.healthy();
    }
}
