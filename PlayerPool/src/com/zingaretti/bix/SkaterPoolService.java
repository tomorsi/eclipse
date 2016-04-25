package com.zingaretti.bix;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/PlayerPoolService")
public class PlayerPoolService {

   SkaterPoolDao skaterDao = new SkaterPoolDao();
   GoalPoolDao goalieDao = new GoaliePoolDao(); 
   
   @GET
   @Path("/skaters")
   @Produces(MediaType.APPLICATION_XML)
   public List<Skater> getSkaters(){
      return skaterPoolDao.getAllSkaters();
   }	
   
   @PUT
   @Path("/skaters")
   @Consumes(MediaType.APPLICATION_XML)
   public void addSkater()
   {
	   
   }
   
   @POST
   @Path("skaters")
   @Consumes(MediaType.APPLICATION_XML)
   public void modifySkater()
   {
	   
   }

   @GET
   @Path("/goalies")
   @Produces(MediaType.APPLICATION_XML)
   public List<Goalies> getGoalies(){
      return goaliePoolDao.getAllGoalies();
   }	
   
   @PUT
   @Path("/goalies")
   @Consumes(MediaType.APPLICATION_XML)
   public void addGoalie()
   {
	   
   }
   
   @POST
   @Path("/goalies")
   @Consumes(MediaType.APPLICATION_XML)
   public void modifyGoalie()
   {
	   
   }
   
}