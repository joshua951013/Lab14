package edu.handong.csee.java.prob4; //a package name

public class Boundary { //a class is made

	private static int [] arr = new int[5]; //instance var, setting the array
	private static int cnt = 0; //instance var

	public void receive(int num) throws ArrayIndexOutOfBoundsException{ //a method is made

		int i = cnt; //local var,gets in the cnt value to i
		arr[i] = num; // sets the ith arr value to num
		cnt++; //cnt +1
		System.out.printf("arr[%d] <- %d\n", i, num); //prints out the following
	}
}

