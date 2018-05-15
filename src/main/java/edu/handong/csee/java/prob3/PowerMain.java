package edu.handong.csee.java.prob3; //a package name
import java.util.Scanner; //importing the scanner

public class PowerMain { //a class is made

	public static final Powercalc my_calculator = new Powercalc(); //instantiating the powercalc as my calculator
	public static final Scanner in = new Scanner(System.in); //instantiating scanner as in  

	public static void main(String[] args) { //main method is made
		while (in.hasNextInt()) { //while statement
			int n = in.nextInt(); //gets in the value from the user and insert into n
			int p = in.nextInt(); //gets in the value from the user and insert into p

			try { //try statement
				System.out.println(my_calculator.power(n, p)); //prints out the following
			} catch (Exception e) { //catch statement 
				System.out.println(e); //prints out the following
			}
		}
	}
}

