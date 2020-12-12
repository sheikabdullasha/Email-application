package projectEmail;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String alternateEmail;
	private int mailboxCapacity=500;
	private String password;
	private int passwordLength=9;
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		//System.out.println("Email Created : "+this.firstName+" "+this.lastName);
		this.department=setDepartment();
		//System.out.println(this.firstName+" "+this.lastName+" works in "+this.department+" DEPARTMENT");
		this.password=generatePassword(passwordLength);
		//System.out.println("password :"+this.password);
		this.email=this.firstName+"."+this.lastName+"@"+this.department+".pippipers"+"."+"com";
		this.alternateEmail=this.email;
	}
	
	

	

	public String getAlternateEmail() {
		return alternateEmail;
	}





	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}





	public int getMailboxCapacity() {
		return mailboxCapacity;
	}





	public void setMailboxCapacity(int mailboxCapacity) {
		this.mailboxCapacity = mailboxCapacity;
	}



	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	private String setDepartment() {
		System.out.println("select Department code\n 1 for Sales\n2 for Development\n3 for Accounting\n4 for None");
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Code : ");
		int choice=in.nextInt();
		if(choice == 1) {return "Sales";}
		else if(choice == 2) {return "Development";}
		else if(choice == 3) {return "Accounting";}
		else {return "NoneOf";}
		
	}
	private String generatePassword(int length) {
		String pass="qwertyuiopasdfghjklzxcvbnm1234567890!@#$%^&*";
		char []passchar=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*pass.length());
			passchar[i]=pass.charAt(rand);
		}
		return new String (passchar);
		
	}
	
	public String EmployeeDetails() {
		return ("name:"+this.firstName+"\nDepartment "+this.department+"\nemail id: "+this.alternateEmail);
		
	}

	
	

}
