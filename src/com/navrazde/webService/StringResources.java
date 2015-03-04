package com.navrazde.webService;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("strings")
public class StringResources {

	@GET
	public JsonObject getString() {

		return Json.createObjectBuilder().add("first name", "Zdenek")
				.add("last name", "Navratil").add("age", 1).add("XXXX", "YYYY").build();
	}

}
