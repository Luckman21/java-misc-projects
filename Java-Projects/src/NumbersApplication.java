/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

import java.util.*;
import java.util.ArrayList;

public class NumbersApplication {

	public static void main(String[] args) {
		
/*This block of code prints out all the prime numbers, saves them to the list 'prime' and prints 
out the time it took to complete the code and saves that time to the list 'time'*/
		
//https://stackoverflow.com/questions/18021218/create-a-list-of-primitive-int (Integer lists)
		
		int y = 1000000; long sTime = System.currentTimeMillis(); long tStime = System.currentTimeMillis();
		List<Integer> prime = new ArrayList<Integer>();
		List<Long> time = new ArrayList<Long>();
		
		System.out.println(2);
		for (int i = 1; i < y; i+=2) {
			boolean isPrime = true; int count = 0;
				for (int z = 1; z <= Math.sqrt(i); z++){
					if (i%z == 0) 
						count+=1;
					if (count > 1) {
						isPrime = false; break;}
				}
				if (isPrime == true) {
					System.out.println(i+" is a prime #.");
					prime.add(i);}
				/*else
					System.out.println(i+" is not a prime #.");*/
		}
		long eTime = System.currentTimeMillis();
		System.out.println("Time of process (ms): "+(eTime-sTime)); time.add(eTime-sTime);;
		System.out.println(prime);
		
/*This block of code prints all the pairs of primes that are more than twice the smaller prime number +1.
 * It then saves it to a list and prints out the time it took to complete the code*/
		
//http://www.java67.com/2016/07/how-to-find-length-size-of-arraylist-in-java.html (size of a list)
		
		sTime = System.currentTimeMillis();
		List<Integer> pPair1 = new ArrayList<Integer>();
		List<Integer> pPair2 = new ArrayList<Integer>();
		
		for (int i = 0; i < prime.size();i++) {
			for (int z = 0; z < prime.size();z++) {
				if ((prime.get(z)*2)+1 > prime.get(i))
					break;
				else if ((prime.get(z)*2)+1 == prime.get(i)) {
					pPair1.add(prime.get(z)); 
					pPair2.add(prime.get(i));
					System.out.println(prime.get(z)+" and "+ prime.get(i));
				}
			}
		}
		System.out.println(pPair1);
		System.out.println(pPair2);
		
		eTime = System.currentTimeMillis();
		System.out.println("Time of process (ms): "+(eTime-sTime)); time.add(eTime-sTime);
		
/*This block of code finds all the perfect, abundant and deficient up to 1000 and appends them to a list.  It then prints out 
 * the time it took to complete the code.  Perfect numbers are tabbed so they are easier to find.*/
		
//https://www.britannica.com/science/perfect-number (what are perfect numbers)

		y = 1000; sTime = System.currentTimeMillis();
		List<Integer> perfect = new ArrayList<Integer>();
		List<Integer> abundant = new ArrayList<Integer>();
		List<Integer> deficient = new ArrayList<Integer>();
		
		for (int i = 1; i <= y; i++) {
			int num = 0; List<Integer> nums = new ArrayList<Integer>();
			
			for (int z = 1; z < i; z++){
				if (i%z == 0) 
					nums.add(z);
			}
			if (nums.size() > 0) {
				for (int f = 0; f < nums.size();f++){
					num+=nums.get(f);
				}
				if (num == i && i >= 6) {
					perfect.add(i);
					System.out.println("\t"+i+ " is a perfect #");
				}
				else if (num < i) {
					deficient.add(i);
					System.out.println(i+ " is a deficient #");
				}
				else if (num > i) {
					abundant.add(i);
					System.out.println(i+ " is a abundant #");
				}
			}
		}
		System.out.println("Perfect numbers: "+perfect);
		eTime = System.currentTimeMillis();
		System.out.println("Time of process (ms): "+(eTime-sTime)); time.add(eTime-sTime);
		
/*This block of code takes a 3 digit integer, converts it to a string and breaks up the string into substring and is appended to a list.
 * The substring is then converted to integers which are appended to another list.  A for loop runs through all integers in the
 * list and finds all the 3 digit numbers that are equal to the sum of the cubes of their digits.*/

//http://javadevnotes.com/java-integer-to-string-examples (Converting integers to string)
//https://www.mkyong.com/java/java-convert-string-to-int/ (Converting string to integers)
//https://www.techwalla.com/articles/how-to-do-exponents-in-java (Exponents in Java)

		int y1 = 100; int y2 = 1000; sTime = System.currentTimeMillis();
		List<Integer> sOfCubes = new ArrayList<Integer>();
		
		for (int i = 100; y1<= i && i<y2;i++) {
			List<String> itoS = new ArrayList<String>();
			List<Integer> stoI = new ArrayList<Integer>();
			int num = 0;
			
			String intToS = Integer.toString(i);
			
			for (int f = 0; f < intToS.length();f++) {
				itoS.add(intToS.substring(f,f+1));
			}
			for (int f = 0; f < itoS.size();f++) {
				stoI.add(Integer.parseInt(itoS.get(f)));
			}
			for (int f = 0; f < stoI.size();f++) {
				num+=Math.pow(stoI.get(f),3);
			}
			if (num == i) {
				sOfCubes.add(i);
			}
		}
		System.out.println("Sum of cubes (3 digit #'s): "+sOfCubes);
		eTime = System.currentTimeMillis();
		System.out.println("Time of process (ms): "+(eTime-sTime)); time.add(eTime-sTime);

/*This block of code takes a 4 digit integer, converts it into a string and then breaks up the string 
 * into 2 substrings; if a 4 digit number is represented as abcd, it is now appended as "ab","cd".  These strings
 * are then converted back into integers.  If the square of the sum of these two integers is equal to the original 
 * integer, the number is appended to the list sOfCubes, aka square of sums.*/
		
		y1 = 1000; y2 = 10000; sTime = System.currentTimeMillis();
		List<Integer> sOfSums = new ArrayList<Integer>();
		
		for (int i = 1000; y1<= i && i<y2;i++) {
			List<String> itoS = new ArrayList<String>();
			List<Integer> stoI = new ArrayList<Integer>();
			int num = 0;
			
			String intToS = Integer.toString(i);
			
			for (int f = 0; f < intToS.length();f+=2) {
				itoS.add(intToS.substring(f,f+2));
			}
			for (int f = 0; f < itoS.size();f++) {
				stoI.add(Integer.parseInt(itoS.get(f)));
			}
			for (int f = 0; f < stoI.size();f++) {
				num+=stoI.get(f);
			}
			if (num*num == i) {
				sOfSums.add(i);
			}
		}
		System.out.println("Squares of sums (4 digit #'s): "+sOfSums);
		eTime = System.currentTimeMillis();
		System.out.println("Time of process (ms): "+(eTime-sTime)); time.add(eTime-sTime);

/*This next code block prints all the process times for each process, then prints out the total time of the code.*/
		
		for (int i = 1;i < 50;i++) {
			System.out.println("\n");
		}
		System.out.println("All runtimes:");
		System.out.println("\n\tPrime numbers 1 to 1 million (secs): "+(time.get(0))/1000.0+"s");
		System.out.println("\tPairs of Primes X*2-1 = Y (secs): "+(time.get(1))/1000.0+"s");
		System.out.println("\tPerfect, abundant and deficient numbers (secs): "+(time.get(2))/1000.0+"s");
		System.out.println("\tSums of Cubes [3 digit integers] (secs): "+(time.get(3))/1000.0+"s");
		System.out.println("\tSquares of Sums [4 digit integers] (secs): "+(time.get(4))/1000.0+"s");
		
		long tEtime = System.currentTimeMillis();
		System.out.println("\nTOTAL RUN TIME (secs): "+((tEtime-tStime)/1000.0)+"s");
	}
}
