package com.hcl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FlightAvailability")
public class FlightAvailability {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flight_avail_id")
	private int flightAvailabilityId;
	
	@Column(name="flight_id")
	private int flightId;
	
	@Column(name="from_location")
	private String fromLocation;
	
	@Column(name="to_location")
	private String toLocation;
	
	@Temporal(value=TemporalType.DATE)
    @Column(name="journey_date")
    private Date journeyDate;
	
	@Column(name="availability")
	private int availability;
	
	@Column(name="flight_avail")
	private boolean flightAvailability;
	
	
	 @OneToOne(mappedBy = "flightAvailability")
	    private Flight flight;

	public int getFlightAvailabilityId() {
		return flightAvailabilityId;
	}

	public void setFlightAvailabilityId(int flightAvailabilityId) {
		this.flightAvailabilityId = flightAvailabilityId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Date getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}

	public boolean isFlightAvailability() {
		return flightAvailability;
	}

	public void setFlightAvailability(boolean flightAvailability) {
		this.flightAvailability = flightAvailability;
	}
	
	

}
