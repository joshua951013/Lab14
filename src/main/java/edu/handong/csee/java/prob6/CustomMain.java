package edu.handong.csee.java.prob6; //package name
import java.util.Scanner; //inports the scanner

public class CustomMain { //a class is made
	public static void main(String[] args) //main method
	{

		String name, race; // instance var
		int age = 0; //sets age 0
		Scanner keyboard = new Scanner(System.in); //instantiating scanner as keyboard
		CustomID obj = new CustomID(); //instantiating customid as obj
		boolean repeat = true; //boolean type repeat is set as true

		while(repeat) //while its ture
		{
			try { //try statement
				if(obj.getState() == 0) { //if customids state is 0

					System.out.print("Enter your name: "); //prints out the following
					name = keyboard.nextLine(); //gets in the value to name
					obj.set_name(name); //calls the method from customid
				}

				else if(obj.getState() == 1) { //esle if state from customid is 1
					System.out.print("Enter your age: "); //prints out the following
					age = keyboard.nextInt(); //gets in the value to age
					keyboard.nextLine(); //gets the single line
					obj.set_age(age); // calls the method from customid
				}

				else if(obj.getState() == 2) { //else if state from customid is 2
					System.out.print("Enter your race: "); //prints out the following
					race = keyboard.nextLine(); //gets in the value to race
					obj.set_race(race); //calls the method from customid
				}
			}
			catch(Exception e){ //catch statement
				System.out.println(e.getMessage());//prints the following
				continue; //continued
			}
		}
	}
}




