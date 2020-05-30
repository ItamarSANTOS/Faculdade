package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/echo")
public class Exemplo1 {
	
	@GET
	@Produces("text/plain")
	public String echo(@QueryParam ("word") String palavra) {
		return "echo: " + palavra;
	}

}
