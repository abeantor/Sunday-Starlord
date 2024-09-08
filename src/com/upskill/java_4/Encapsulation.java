package com.upskill.java_4;

public class Encapsulation {
	private String name = "Upskill";		//Write and Read
	private int ssn = 845693; 				//Write ONLY
	private String username = "Rasel Alam"; //Write ONLY
	
	
	
	
	// DOB, DI, Address
	
	private String address = "82-11 37th St, NY";
	private int dob = 8478951;
	private int dl = 7985421;
	
	
	//Setter Method = name
	public void setName (String value) {
		name = value;
	}
	
	//Getter Method = name
	public String getName() {
		return name;
	}
	
	//Setter Method = SSIn
	public void setSSN(int value) {
		ssn = value;
	}
	
	//Getter Method = username
	public String getUserName() {
		return username;
	}


}
