/* Project_Name
 * Team 5 (Knee Deep In The Thread)
 * v0.001
 * Date of Last Modification: January 28th, 2016 @ 03:41P.M.
 * Authors:
 * Matthew Kempey
 * Andy Nguyen
 * Gary Adams
 * Justy Jan Tubalado
 * Kevin Jones
 */


public class Project {

	private static void looper() {
		int i;
		for (i = 0; i < 100; i++)
			if (i % 3 == 0 &&  i % 5 == 0)
				System.out.println("Fizzbuzz");
			if (i % 3 == 0)
				System.out.println("Fizz");
			if (i % 5 == 0)
				System.out.println("Buzz");
	}

	public static void main(String[] args) {
		System.out.print("Hello, world!");
		System.out.println("Testing a change.");
		looper();

		
	}
}
