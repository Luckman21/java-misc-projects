/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NumberFunctions {

//Max Methods
	
	/**
	 * This max method returns the higher values of the two input (int)
	 * @param a Input one (int)
	 * @param b Input two (int)
	 * @return the maximum value of the first and second inputs
	 */
	public static int max(int a, int b) {
		return Math.max(a, b);
	}
	
	/**
	 * This max method sorts the array and returns the last value in the list
	 * @param arrayOfInts input one (int [] array)
	 * @return The maximum value of the fist and second inputs
	 */
	public static int max(int[] arrayOfInts) {
		Arrays.sort(arrayOfInts);
		return arrayOfInts[arrayOfInts.length-1];		
	}
	
	/**
	 * This max method returns the higher values of the two inputs (float)
	 * @param a Input one (float)
	 * @param b Input two (float)
	 * @return The maximum value of the fist and second inputs
	 */
	public static float max(float a, float b) {
		return Math.max(a, b);
	}

//Min Methods
	
	/**
	 * This min method returns the lower values of the two input (int)
	 * @param a Input one (int)
	 * @param b Input two (int)
	 * @return the minimum value of the first and second inputs
	 */
	public static int min(int a, int b) {
		return Math.min(a, b);
	}
	
	/**
	 * This min method sorts the array and returns the first value in the list
	 * @param arrayOfInts input one (int [] array)
	 * @return The minimum value of the fist and second inputs
	 */
	public static int min(int[] arrayOfInts) {
		Arrays.sort(arrayOfInts);
		return arrayOfInts[0];		
	}
	
	/**
	 * This min method returns the lower values of the two inputs (float)
	 * @param a Input one (float)
	 * @param b Input two (float)
	 * @return The minimum value of the fist and second inputs
	 */
	public static float min(float a, float b) {
		return Math.min(a, b);
	}
	
	public static void main(String[] args) {
		
		int [] array = {4,6,8,10,1,2,5,3,7,9};
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
	
		int num1 = ThreadLocalRandom.current().nextInt(0, 1000);
		int num2 = ThreadLocalRandom.current().nextInt(0, 1000);
		float numA = Float.MIN_VALUE;
		float numB = Float.MAX_VALUE;
	
//Max Output
		System.out.println(num1+" and "+num2+"; "+max(num1,num2)+" is greater.");
		System.out.println(list+"; "+max(array)+" is the greatest.");
		System.out.println(numA+" and "+numB+"; "+max(numA,numB)+" is greater.");
		
//Min Output
		System.out.println("\n"+num1+" and "+num2+"; "+min(num1,num2)+" is less.");
		System.out.println(list+"; "+min(array)+" is the least.");
		System.out.println(numA+" and "+numB+"; "+min(numA,numB)+" is less.");
	}
}
