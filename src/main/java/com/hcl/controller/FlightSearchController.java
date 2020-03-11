package com.hcl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Flight;
import com.hcl.service.FlightSearchService;

@RestController

public class FlightSearchController {

	
	  @Autowired 
	  FlightSearchService flightSearchService;
	 
	
	@GetMapping("/jalaja/{fromlocation}/{tolocation}/{journeyDate}")
	public List<Flight> findBySourceDestinationAndJourneydate(@PathVariable("fromlocation") String fromlocation,
			@PathVariable("tolocation") String tolocation, @PathVariable("journeyDate") String journeyDate) {
		
		return flightSearchService.flightSearchByFromTolocationAndJourneyDate(fromlocation, tolocation, journeyDate);
	}
}
