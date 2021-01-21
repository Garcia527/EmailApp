package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created " + this.firstName + " " + this.lastName);
		
		// Call method asking for department 
		this.department = setDepartment();
		System.out.println("Department = " + this.department);
		
		// Call method that will return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password = " + this.password);
	}
	
	// Ask for department 
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none\nEnter you department code:");
		Scanner in = new Scanner(System.in);
		int dep = in.nextInt();
		if(dep == 1) {
			return "Sales";
		}
		else if(dep == 2) {
			return "Development";
		}
		else if(dep == 3) {
			return "Accounting";
		}
		else return "None";
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	// Set the mailbox capacity
	
	// Set the alternative email
	
	// Change the password

}
