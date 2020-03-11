package com.hcl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hcl.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer> {
     
	 @Query("SELECT t FROM  Flight t where t.fromLocation = :fromlocation "
	 		+ "and t.toLocation = :toLocation" +"and t.journeyDate = :journeyDate" )
	 List<Flight> findByFromToLocationandJourneyDate(@Param("fromlocation") String fromlocation,
			  @Param("toLocation") String toLocation,
			  @Param("journeyDate") String journeyDate);
}
