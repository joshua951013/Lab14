package edu.handong.csee.java.prob1; //new package 

public class SpeedLimitter { //a new class is made

	private int speed = 0; //instance var
	private int limit = 0; //instance var

	public SpeedLimitter(int limit, int speed){ //a constructor

		this.limit = limit; //gets in the limit value as limit
		this.speed = speed; //gets in the speed value as speed
	}

	public void warnSpeedLimit(){ //a new method

		try { //try statement
			if(this.speed > this.limit) //if statement, if the speed is greater than the limit
			{
				throw new Exception("Speed Limit " + this.limit + "km exceeded!"); //prints the following
			}

			System.out.println("You are a law abiding citizen!"); // if not, prints out the following

		}catch(Exception e) { //catch statement
			System.out.println(e.getMessage()); //prints out the following
			System.out.println("You are being fined. "); //prints out the following
		}
		System.out.println("Your current speed: " + this.speed); //prints out the following
	}
}


