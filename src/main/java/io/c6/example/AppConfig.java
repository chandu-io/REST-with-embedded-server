package io.c6.example;

import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

  public AppConfig() {
    packages("io.c6.example.rest");
  }
}
