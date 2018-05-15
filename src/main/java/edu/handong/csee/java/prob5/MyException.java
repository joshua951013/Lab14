package edu.handong.csee.java.prob5;// a package name

public class MyException extends Exception { //this class inherited from Exception
	
	private String message = null; //instance var 
	public MyException() { //constructor
		super(); //sets as super
	}

	public MyException(String message) { //constructor

		super(message); //supers message
		this.message = message; //gets in the message value to this.message
	}

	public MyException(Throwable cause) { //constructor
		super(cause); //gets cause value as super
	}

	public String toString() { //method is made
		return message; //returns the message value
	}
}

