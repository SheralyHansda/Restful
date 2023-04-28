package com.service.restful;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("thepath")
public class demoResource 

{
	demoRepository repo = new demoRepository();//object of demoResorce
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<demo> getdemos()
	{
		System.out.println("demo called... ");
		return repo.getdemos();// fetching data from database
		
	}
	// @GET for fetching the resource
	// @PUT for updating a resource
	// @DELETE for deleting a resource
	// @PathParam - when get a request and that request has id in it then the @Path id becomes the @PathParam id which is then assigned within the parameter
	
	@GET
	@Path("demo/{id}") //id is just a place holder
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public demo getdemo(@PathParam("id")int id)//to store the variable
	{
		return repo.getdemo(id);
	}
	
	

	
	@POST //for creating a resource
	@Path("demo")
	@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public demo createdemo(demo a1)//method that returns an object
	{
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}

}
