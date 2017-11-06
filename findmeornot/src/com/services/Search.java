package com.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.services.SearchValidation.Validation;
import com.util.Animal;


@Path("/search")
public class Search {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String doSearch(@QueryParam("animalName") String animalName, @QueryParam("userName") String userName) {
		Validation val = SearchValidation.isValid(animalName);
		if (val.isIsvalid()) {
			String foundResult = " is NOT Found";
			if (Animal.getAnimals().contains(animalName.toLowerCase())) {
				foundResult = " is Found";
			}
			if (userName.isEmpty()) {
				userName = "There";
			}
			return "<html> " + "<title>" + "Search Result" + "</title>" + "<body><h1>" + "Hey "+ userName + "!, The animal "
					+ animalName + foundResult + "</body></h1>" + "</html> ";
		} else {
			return val.getMessage();
		}
	}
}

