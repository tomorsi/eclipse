package com.zingaretti.bix;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tutorialspoint.User;
import com.tutorialspoint.UserDao;

@Path("/PlayerPoolService")
public class PlayerPoolService {

   SkaterPoolDao skaterDao = new SkaterPoolDao();
   GoalPoolDao goalieDao = new GoaliePoolDao(); 
   
   @GET
   @Path("/skaters")
   @Produces(MediaType.APPLICATION_XML)
   public List<User> getSkaters(){
      return userDao.getAllUsers();
   }	
   
   @PUT
   @Path("/skaters")
   public void addSkater()
   {
	   
   }
   
   @POST
   @Path("skaters")
   public void modifySkater()
   {
	   
   }

   @GET
   @Path("/goalies")
   @Produces(MediaType.APPLICATION_XML)
   public List<Goalies> getGoalies(){
      return goalieDao.getAllGoalies();
   }	
   
   @PUT
   @Path("/goalies")
   public void addGoalie()
   {
	   
   }
   
   @POST
   @Path("/goalies")
   public void modifyGoalie()
   {
	   
   }
   
}