package com.bitm.selenium4thbatch.DTO;

public class FlightFinderDTO {
	
	private String passenger_no;
	private String depart_from;
	private String depart_month;
	private String depart_date;
	private String arrive_in;
	private String arrive_month;
	private String arrive_date;
	private String airline;
	
	
	public String getPassenger_no() {
		return passenger_no;
	}
	public void setPassenger_no(String passenger_no) {
		this.passenger_no = passenger_no;
	}
	public String getDepart_from() {
		return depart_from;
	}
	public void setDepart_from(String depart_from) {
		this.depart_from = depart_from;
	}
	public String getDepart_month() {
		return depart_month;
	}
	public void setDepart_month(String depart_month) {
		this.depart_month = depart_month;
	}
	public String getDepart_date() {
		return depart_date;
	}
	public void setDepart_date(String depart_date) {
		this.depart_date = depart_date;
	}
	public String getArrive_in() {
		return arrive_in;
	}
	public void setArrive_in(String arrive_in) {
		this.arrive_in = arrive_in;
	}
	public String getArrive_month() {
		return arrive_month;
	}
	public void setArrive_month(String arrive_month) {
		this.arrive_month = arrive_month;
	}
	public String getArrive_date() {
		return arrive_date;
	}
	public void setArrive_date(String arrive_date) {
		this.arrive_date = arrive_date;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	
	@Override
	public String toString(){
		
		return "FlightFinderDTO [passenger_no = "+ passenger_no +", depart_from = "+ depart_from +","
				       + "depart_month = "+ depart_month +", depart_date = "+ depart_date +","
					   + "arrive_in = "+ arrive_in +", arrive_month = "+ arrive_month +","
					   + "arrive_date = "+ arrive_date +", airline = "+ airline +"]";
	}
	
	

}
