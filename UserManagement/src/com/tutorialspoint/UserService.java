package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * NOTES:
 * 
 * When the jersey jaxrs-ri jars are copied into 
 * WEB-INF/lib the IDE will not see them until the 
 * project is refreshed with F5.
 * @author torsi
 *
 */
@Path("/UserService")
public class UserService {

   UserDao userDao = new UserDao();

   @GET
   @Path("/users")
   @Produces(MediaType.APPLICATION_XML)
   public List<User> getUsers(){
      return userDao.getAllUsers();
   }	
}