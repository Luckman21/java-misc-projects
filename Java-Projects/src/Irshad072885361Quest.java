/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class Irshad072885361Quest {
	
	/**
	 * foo takes in two integer parameters and tests to see if they are an even or odd number.
	 * If odd, it will return the return value of goo(integer a+ integer b).  Otherwise, it returns goo(integer a).
	 * @param a Input 1 (int)
	 * @param b Input 2 (int)
	 * @return goo(a+b) if a+b is an odd number, otherwise, goo(a)
	 */
	public static int foo(int a, int b) {
		
		if ((a+b)%2 != 0)
			return goo(a+b);
		else
			return goo(a);
	}
	
	/**
	 * goo takes in one integer parameter and calls itself again like goo(intger a - 1) + integer a
	 * It is recursive until integer a is a negative number, where it then returns 0
	 * @param a Input 1 (int)
	 * @return if a < 0, then returns 0, otherwise, goo(a-1)+a
	 */
	public static int goo(int a) {
		if (a < 0)
			return 0;
		return goo(a-1)+a;
	}
	
	public static void main(String[] args) {
		
		//This nested loop tests each value from 0 to 10 with values from 0 to 10 as two parameters for the method foo
		//and prints them out to the console
		for (int i = 0; i <= 10;i++) {
			for (int j = 0; j <=10;j++) {
				System.out.println(foo(i,j));
			}
		}
	}
}

/**
 * Create and properly document a Java application that will produce the following:
 * a class name <lastName><studentNumber> with the following methods
 * a method called "foo" which returns an integer and takes in two integer values, which returns the "goo" of the addition of the two values if the addition is an odd number, or returns "goo" of just the first number
 * a method called "goo" which returns an integer value and takes in one integer value, which returns "goo" of (the input parameter - 1) + the value of the input parameter
 * the method "goo" returns 0 if the input value is negative
 * a main portion of the program that tests and outputs the return value of "foo" with a nested counted loop each from 0 to 10, where the outer loop is the first parameter for "foo" and the inner loop is the second parameter
- include documentation to the best of your abilities
 */