package com.quarkus.crud;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/crud")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {


    @GET
    public Response getAll() {
        return Response.ok("GET response: All items retrieved").build();
    }

    @POST
    public Response create(String item) {
        return Response.ok("POST response: Created item " + item).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") String id, String item) {
        return Response.ok("PUT response: Updated item " + id + " with " + item).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") String id) {
        return Response.ok("DELETE response: Deleted item with id " + id).build();
    }
}
