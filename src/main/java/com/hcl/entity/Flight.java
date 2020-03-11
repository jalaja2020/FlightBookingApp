package com.hcl.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "flight_id")
	private  int flightId;
	
	@Column(name = "flight_name")
	private  String flightName;
	
	@Column(name = "from_location")
	private  String fromLocation;
	
	@Column(name = "to_location")
	private  String toLocation;
	
	@Temporal(value=TemporalType.DATE)
    @Column(name="journey_date")
    private Date journeyDate;
	
	@Column(name="no_of_seats")
	private int noOfSeats;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "Flight_Fightbooking",
	        joinColumns = @JoinColumn(name = "flight_id"),
	        inverseJoinColumns = @JoinColumn(name = "flight_booking_id"))
	private Set<FlightBooking> flightBooking;
	 
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "flight_avail_id")
	    private FlightAvailability flightAvailability;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
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
}
