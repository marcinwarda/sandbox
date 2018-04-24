package mwr.omd;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class API {
	
	@RequestMapping(method = RequestMethod.GET, path="/api/ping", produces = "application/json")
	public Response ping() {
		return new Response("Pong!");
	}
}
