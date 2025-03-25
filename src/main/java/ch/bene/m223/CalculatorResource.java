package ch.bene.m223;  

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("/add/{first}/{second}")
    @Produces(MediaType.TEXT_PLAIN)
    public int add(@PathParam("first") int first, @PathParam("second") int second) {
        return first + second;
    }
}
