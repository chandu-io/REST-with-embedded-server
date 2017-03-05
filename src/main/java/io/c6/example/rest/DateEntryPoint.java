package io.c6.example.rest;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Path("/date")
public class DateEntryPoint {

  private final static Log log = LogFactory.getLog(DateEntryPoint.class);

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String today() {
    log.info("[/date] resource serving now");
    return LocalDate.now().toString();
  }
}
