package tech.adriano.quarkus.sandbox;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/hello")
public class HelloApi {

    @GET
    public String hello() {
        return "Hello RESTEasy";
    }
}
