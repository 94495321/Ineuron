package arrayass;

import java.util.Scanner;

public class Loginmain {
	
	public static void main(String[] args) 
	{
		String Username = "sharana";
		String Password = "98765sharan";
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter user name : ");
		String username = input1.next();

		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter user Password : ");
		String password = input2.next();
		
		
		if(Password.equals(password)&& Username.equals(username))
		{
			System.out.println("Welcome to the Page");
		}
		else if(Username.equals(username)) {
			System.out.println("password not correct");
		}
		else if(Password.equals(password))
		{
			System.out.println("username not correct");
		}
		else {
			System.out.println("username and password invalid");
		}
		
	}
		

}
