package edu.handong.csee.java.prob2;//a new package
import java.util.*; //imports the following

public class In_exception { //a new class

	private int x = 0, y = 0; //instance variables 
	public In_exception() // public constructor 
	{}

	public void error_det() { //a new method 
		try{ //try statement
			Scanner keyboard = new Scanner(System.in); //instantiating the scanner as keyboard
			System.out.print("x: "); //prints the following
			x = keyboard.nextInt(); //gets in the value from the user to x
			System.out.print("y: "); //prints the following
			y = keyboard.nextInt(); //gets in the value from the user to y
			System.out.println(this.x/this.y); //prints out the x and y values
		}

		catch(ArithmeticException e){ //catch statement

			System.out.println("java.lang.ArithmeticException: " + e.getMessage()); //prints out the following
		}

		catch(InputMismatchException e){ //catch statement
			System.out.println("java.util.InputMismatchException"); //prints out the following
		}

		catch(Exception e) { //catch statement
			System.out.println("Some other exception has occurred: " + e.getMessage()); //prints out the following
		}
	}
}

