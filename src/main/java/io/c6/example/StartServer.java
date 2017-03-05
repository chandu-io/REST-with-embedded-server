package io.c6.example;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.glassfish.jersey.servlet.ServletContainer;

import java.io.File;

public class StartServer {

  private final static Log log = LogFactory.getLog(StartServer.class);

  public static void main(final String[] args) throws Exception {
    final Tomcat tomcat = new Tomcat();
    final int port = 8080;
    tomcat.setPort(port);
    final Context ctx = tomcat.addContext("/rest", new File(".").getAbsolutePath());
    final String servletName = "EmbeddedTomcat";
    Tomcat.addServlet(ctx, servletName, new ServletContainer(new AppConfig()));
    ctx.addServletMappingDecoded("/api/*", servletName);
    tomcat.start();
    log.info(String.format("[================Server starting on port %d================]", port));
    tomcat.getServer().await();
  }
}
