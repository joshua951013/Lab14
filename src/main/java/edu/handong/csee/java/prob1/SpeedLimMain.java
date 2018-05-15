package edu.handong.csee.java.prob1; //a new package
import java.util.Scanner; //importing the scanner 
import java.util.Random;  //importing the random

public class SpeedLimMain { //new class is made
	public static void main(String[] args) { //the main method is made

		Scanner keyboard = new Scanner(System.in); //instantiating the scanner as keyboard
		Random rand = new Random(); //instantiating the random as rand
		int limit = 0, speed = 0; //initializing the following var 

		System.out.print("Set the speed limit, officer: "); //prints out the following

		limit = keyboard.nextInt(); //gets in the value from the user to limit
		speed = rand.nextInt(101); //speed is set randomly in 101

		SpeedLimitter lim = new SpeedLimitter(limit, speed); //instantiating speedlimitter as lim 
		lim.warnSpeedLimit(); // calls the following method from speedlimiteer

		keyboard.close(); // closed
	}
}

