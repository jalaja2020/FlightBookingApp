package com.hcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.entity.Flight;
import com.hcl.repository.FlightRepository;

@Service
public class FlightSearchService {

	@Autowired
	FlightRepository flightRepository;
	
	public List<Flight> flightSearchByFromTolocationAndJourneyDate(String fromlocation,String tolocation,String journeyDate){
		return flightRepository.findByFromToLocationandJourneyDate(fromlocation, tolocation, journeyDate);
	}
}
