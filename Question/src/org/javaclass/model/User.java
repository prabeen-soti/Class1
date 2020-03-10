package org.javaclass.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private int age;
	
	private Date dob;
	
	private Address address;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("dd/MM/yyyy");
		return "Firstname : " + firstName + 
				"\nLastname : " + lastName + 
				"\nEmail : " + email + 
				"\nAge : " + age+
				"\nDate Of Birth : " + format.format(dob) + 
				"\n" + address;
	}
	
	
	

}
