package Threads;

import java.util.*;

public class Main {

	/**
	 * @param args
	 * Principal method 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassThreads thread =ClassThreads.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the list size: \n");
		int size = scan.nextInt();

		thread.run(size);

		thread.run2();

	}

}
