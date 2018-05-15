package edu.handong.csee.java.prob4; //package name
import java.util.Scanner; //imports scanner

public class BoundMain { //a class is made
	public static void main(String[] args){ // a method is made

		Scanner keyboard = new Scanner(System.in); //instantiating scanner as keyboard
		int num = 0; //local var num is set as 0
		Boundary arr = new Boundary(); //instantiating boundary as arr
		boolean repeat = true; // boolean type repeat is set as true

		while(repeat){ //while its true
			try{ //try statement

				System.out.print("Enter an integer: "); //prints out the following
				num = keyboard.nextInt(); //gets in the value from the user to num
				arr.receive(num); //calls the method from boundary
			}

			catch(ArrayIndexOutOfBoundsException e){ //catch statement

				System.out.println("Invalid array index access!"); //prints out the following
				repeat = false; //sets repeat as false
			}
		}
	}
}

