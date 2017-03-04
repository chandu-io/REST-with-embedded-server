package io.c6.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDate;

@Path("/app")
public class DateEntryPoint {

  @GET
  @Path("today")
  public String today() {
    return LocalDate.now().toString();
  }
}
