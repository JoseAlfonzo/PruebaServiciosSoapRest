package com.parameta.aplication;

import org.glassfish.jersey.server.ResourceConfig;

public class RestServiceAplication extends ResourceConfig {
    public RestServiceAplication() {
        packages("com.parameta.service");
    }
}