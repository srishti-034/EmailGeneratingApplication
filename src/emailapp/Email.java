/*
 * class Email consist of all the data members and methods for implementing
    different functionalities of the application
 */
package emailapp;

import java.util.Scanner;

public class Email {
 private String fname;
 private String lname;
 private String pwd;
 private String email;
 private String department;
 private String altEmail;
 private int mailBoxCapacity = 100;
 private int pwdLength = 8;
 private String companySuffix = "xyzcompany.com";
 public Email(String firstName, String lastName) //constructor to get first and last name
 {
	 this.fname = firstName;
	 this.lname = lastName;
	 this.department = setDepartment();
	 this.pwd = generatePassword(pwdLength);
	 this.email = fname.toLowerCase() +"."+ lname.toLowerCase() +"@"+ department +"."+ companySuffix;
	 System.out.println("Email and password for new employee are generated..!");
 }  
 
 private String setDepartment()  // method that asks for department
 {
	 System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
	 System.out.println("Choose the department: ");
	 Scanner s = new Scanner(System.in);
	 int choice = s.nextInt();
	 switch(choice)
	 {
	 case 1: return "sales";
	 case 2: return "dev";
	 case 3: return "acc";
	 default : return "";
	 }
 }
 private String generatePassword(int length) //this method generates random password
 {
	 String pwdDomain = "abcdef123ghijkl456mnopqr789stuvwxy0!@z#&*";
	 char[] password = new char[length];
	 for(int i = 0; i < length; i++)
	 {
		 int randNum = (int) (Math.random()*pwdDomain.length());
		 password[i] = pwdDomain.charAt(randNum);
	 }
	 return new String(password);
 }
 public void setAlternateEmail(String altEmail)
 {
	 this.altEmail = altEmail;
	 System.out.println("Alternate email has been set..!");
 }
 public void changePassword(String newPwd)
 {
	 this.pwd = newPwd;
	 System.out.println("Password has been changed..!");
 }
 public  void setMailboxCapacity(int capacity)
 {
	this.mailBoxCapacity = capacity;
	System.out.println("It has been set...");
 }
 // get methods to implement encapsulation 
 public int getMailboxCapacity()
 {
	 return mailBoxCapacity;
 }
 public String getAlternateEmail()
 {
	 return altEmail;
 }
 public String getPassword()
 {
	 return pwd;
 }
 // method to display information
 public void display()
 {
	 System.out.println("Employee Name : "+ fname + " "+ lname);
	 System.out.println("Company Email : "+ email);
	 System.out.println("Alternate Email : "+ altEmail);
	 System.out.println("Mailbox Capacity : "+ mailBoxCapacity + "MB");
 }
}
