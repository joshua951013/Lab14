package edu.handong.csee.java.prob5; //a package name
import java.util.Scanner; // imports the scanner

public class MyMain { //a class is made

	public static void main(String[] a){ //the main method

		try{ //try statement
			Scanner keyboard = new Scanner(System.in); //instantiating scanner as keyboard
			String str = keyboard.nextLine(); //gets in the value from the user into str
			MyMain.myTest(str); // calls mytest method from mymain class with str value

		} catch(MyException mae){ //catch statement
			System.out.println("Inside catch block: " + mae); //prints out the following
		}
	}

	static void myTest(String str) throws MyException{ //a method is made
		if(str.equals("null")){ //if statement, if str is null 
			throw new MyException("String val is null"); //prints out the follwoing
		}

		else //else statement
			System.out.println("String val is:" + str); //prints out the following
	}
}



