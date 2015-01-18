package ch.dropbit.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("rest")
public interface RestService {

    @GET
    @Path("hello/{name}")
    public String handleGet(@PathParam("name") String name, @Context SecurityContext context);

}
