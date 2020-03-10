package org.javaclass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.javaclass.model.Address;
import org.javaclass.model.User;

public class Question {

	public static void main(String[] args) throws ParseException {
		
		User user = new User();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter First Name:");
		String firstName = scan.nextLine();
		user.setFirstName(firstName);
		
		System.out.println("Enter Last Name:");
		String lastName = scan.nextLine();
		user.setLastName(lastName);
		
		System.out.println("Enter Email:");
		String email = scan.nextLine();
		
		String emailRegex = "\\b[\\w\\.-]+@[\\w\\.-]+\\.\\w{2,4}\\b";
		Pattern emailPattern = Pattern.compile(emailRegex);
		Matcher m3 = emailPattern.matcher(email);
		while(!m3.matches()) {
			System.out.println("Email is not Valid Enter Again: ");
			email= scan.nextLine();
			m3 = emailPattern.matcher(email);
		}
		user.setEmail(email);
		
		System.out.println("Enter Age:");
//		int age = scan.nextInt();
		int age = Integer.valueOf(scan.nextLine());
		user.setAge(age);
//		scan.nextLine();
		
		System.out.println("Enter Date of Birth(yyyy-MM-dd): ");
		String dob = scan.nextLine();
		
		String dobRegex = "(\\d{4}(-)\\d{2}\\2\\d{2})";
		Pattern dobPattern = Pattern.compile(dobRegex);
		Matcher dobMatcher = dobPattern.matcher(dob);
		while(!dobMatcher.matches()) {
			System.out.println("Enter date in valid formtte (yyyy-MM-dd): ");
			dob= scan.nextLine();
			dobMatcher = dobPattern.matcher(dob);
		}
		SimpleDateFormat format = new SimpleDateFormat();
		format.applyPattern("yyyy-MM-dd");
		Date dobdate = format.parse(dob);
		user.setDob(dobdate);
		
		Address address = new Address();
		System.out.println("Enter Address \n Country Name:");
		String countryName = scan.nextLine();
		address.setCountryName(countryName);
		
		System.out.println("State Name:");
		String stateName = scan.nextLine();
		address.setStateName(stateName);
		
		System.out.println("City Name:");
		String cityName = scan.nextLine();
		address.setCityName(cityName);
		
		user.setAddress(address);
		
		System.out.println(user);
		
	}

}
