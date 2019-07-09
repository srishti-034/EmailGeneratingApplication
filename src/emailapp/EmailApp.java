/*
 * This is an application designed from the point of view of an IT support 
   Administrator who needs to create an email account for new employees.
   
 * It takes first name, last name and department of the employee as input and 
   generates an email in the format- "firstname.lastname@department.company.com"
   
 * It also creates a randomly generated password for the newly created account.
 
 * There are other options also using which Admin can set alternate email, change
   default mailbox capacity and password.
 */
package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner s =  new  Scanner(System.in);
		System.out.println("Welcome !\nGenerate email and password for new employee.");
		System.out.println("Enter first name :");
		String fname = s.next();
		System.out.println("Enter last name :");
		String lname = s.next();
		Email em = new Email(fname, lname);
		while(true)
		{   System.out.println("SETTINGS:");
			System.out.println("1- Give alternate email\n2- Change Password\n3- Set Mailbox capacity\n4- Current mailbox capacity\n5- Current alternate email\n6- Current password\n7- Show Information");
	        System.out.println("Choose one option : ");
			int ch = s.nextInt();
			switch(ch)
			{
			case 1: System.out.println("Enter alternate email : ");
        	        String altEmail = s.next();
        	        em.setAlternateEmail(altEmail); 
        	        break;
			case 2:  System.out.println("Enter new password :");
        	         String newPwd = s.next();
        	         em.changePassword(newPwd);
        	         break;
			case 3:  System.out.println("Enter the mailbox capacity :");
        	         int mbc = s.nextInt();
        	         em.setMailboxCapacity(mbc);
				     break;
			case 4:  System.out.println("Current mailbox capacity : "+ em.getMailboxCapacity()+"MB");
				     break;
			case 5:  System.out.println("Current alternate email : "+ em.getAlternateEmail());
				     break;
			case 6:  System.out.println("Current password : "+ em.getPassword());
				     break;
			case 7:  em.display();
				     break;
		    default: System.out.println("Wrong choice..! Enter again :");
			}
		}
		
	}

}
