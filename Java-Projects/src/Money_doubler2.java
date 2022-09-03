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
import java.text.NumberFormat;

public class Money_doubler2 {
	
	public static void main(String[] args) {
		
		/*Compound Interest Formula: A = P(1+i)**n
		
		A = Amount of investment (Future Value)
		P = Principal (Initial Investment or Present Value)
		i = Interest rate per compounding period
		n = Number of compounding periods
		*/
		
		//Variables declared, scanner initialized and introduction is printed to console
		double a = 0.00; double p = 0.00; double i = 0; double n = 12; double x = p;
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, welcome to the money doubler program!\n");
		
		//While loop runs until input from the user is entered with a value greater than 0
		while (true) {
			System.out.println("Enter your initial investment (must be greater than 0): ");
			p = scan.nextDouble(); 
			
			if (p > 0) {
				x = p;break;
			}
			
			else {
				System.out.println("\tYou must invest a number greater than 0!\n");
			}
		}
		
		//While loop runs until input from the user is entered with a value greater than p (the value previously entered)
		while (true) {
			System.out.println("Enter your desired future value (must be greater than "+p+"): ");
			
			a = scan.nextDouble(); // Scans the next token of the input as a double once finished
			
			if (a > p) {
				break;
			}
			
			else {
				System.out.println("\tYou must enter a number greater than "+p+"!\n");
			}
		}
		
		//While loop runs until input from the user is entered with a value greater than 0 and less than or equal to 100.
		//Once entered, it is converted into a decimal that is greater than 0 but less than or equal to 1
		while (true) {
			System.out.println("\nEnter your interest rate per compounding period (enter a value greater than 0 to but less than or equal to 100): ");
			
			i = scan.nextDouble()*0.01; 
			
			if (i*100 > 0 && i <= 1) {
				break;
			}
			
			else {
				System.out.println("\t"+i*100+" is out of range!\n");
			}
		}	
		scan.close();
		
		//Calculation for the months is performed, numbers of a monetary value are converted into currency format and then a print statement outputs the data
		while (x < a) {
			x+=i*x; n++;
		}
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		NumberFormat decimal = NumberFormat.getNumberInstance();
				
		System.out.println("\nIt will take "+(decimal.format(n/12))+" years ("+(decimal.format(n))+" months) with an initial investment of "+(money.format(p))+" and an interest rate of "+i*100+"% compounded monthly to have "+(money.format(a))+".");
		System.out.println("You will earn "+(money.format(a-p))+".\nYou will earn an average of "+(money.format((a-p)/n))+"/month.");
	}
}