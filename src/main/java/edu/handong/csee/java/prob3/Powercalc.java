package edu.handong.csee.java.prob3;//a package name

public class Powercalc { //a new class is made
	public long power(int n, int p) throws Exception{ // a method with the following values as input

		long result = 0; //local var 
		result = (long)Math.pow(n, p); //sets the result as  the following

		if(n < 0 || p < 0)//if statement, if n greater than 0 or p greater than 0
		{
			throw new Exception("n or p should not be negative."); //prints the following
		}

		if(n == 0 && p == 0) //if n and p are 0 
		{
			throw new Exception("n and p should not be zero."); //prints the following
		}
		return result; //returning the result
	}
}

