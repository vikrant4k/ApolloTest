package rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.apollo.pojo.Greeting;
import com.apollo.services.GreetinService;

@Path("/hello")
public class GreetingResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getGreeting() {

		Greeting greeting=null;

		return greeting;

	}
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting  postGreeting(@FormParam("greeting")String greeting)
	{
		System.out.println("greeting "+greeting);
		Greeting greeting2=new GreetinService().insertData(greeting);
		return greeting2;
	}
}
