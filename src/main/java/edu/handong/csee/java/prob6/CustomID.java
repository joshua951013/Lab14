package edu.handong.csee.java.prob6; //a package name

public class CustomID extends Exception{ // this class is inherited from exception

	private String[] races = new String[]{"Vulcans", "Romulan", "Klingons"}; //sets the race array as following
	private String name = ""; //sets name as following
	private int age = 0; //sets age as following
	private String race = ""; //sets race as following
	private int state = 0; //sets state as 0

	public void set_name(String str) throws Exception{ //method that inherits from exception

		if(str.length() < 5) { //if statement if length is smaller than 5
			state = 0; //state is 0
			throw new Exception("Your name is short! Try again!"); //prints the following
		}

		else { //else 
			this.name = str; //sets the str as name
			System.out.println("Name is valid"); //prints out the following
			System.out.println("Name: " + this.name); //prints out the following
			state++; //state+1
		}
	}

	public void set_age(int num) throws Exception{ //this method inherits from exception

		if(num < 18) { //if age is greater than 18
			state = 1; //state is 1
			throw new Exception("You are too young! Try again!"); //prints out the following
		}

		else{ //else statement 

			this.age = num; //gets the num value into age
			System.out.println("Age is valid"); //prints out the following
			System.out.println("Age: " + this.age); //prints out the following
			state++; //state+1
		}
	}

	public void set_race(String race) throws Exception{ //this method inherits from exception

		for(int i = 0; i < races.length; i++){ //for statement 

			if(races[i].equals(race)) { //if race value matches the given races

				this.race = races[i]; //puts ith race into race
				System.out.println("Race is valid"); //prints out the following
				System.out.println("Race: " + races[i]); //prints out the following
				state = 0; //state is 0
				return; //return
			}
		}

		state = 2; //state is 2
		throw new Exception("Human! Try again."); //prints out the following
	}

	public int getState(){ //method is made

		return state; //returns the following
	}
}