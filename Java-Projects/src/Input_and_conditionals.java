import java.util.*;

public class Input_and_conditionals {
	public static void main (String args[]) {
		
		String name; int num, month, day;
		List<String> months = new ArrayList<String>();
		
		months.add("January"); months.add("February"); months.add("March"); months.add("April");
		months.add("May"); months.add("June"); months.add("July"); months.add("August");
		months.add("September"); months.add("October"); months.add("November"); months.add("December");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Hello, please enter your name: ");
		name = input.nextLine();
		System.out.println("Perform this set of calculations:\n\n\t1.) Determine your birthday month (January = 1, February = 2)");
		System.out.println("\t2.) Multiply that number by 5\n\t3.) Add 6 to that number\n\t4.) Multiply that number by 4\n\t5.) Add 9 to that number");
		System.out.println("\t6.) Multiply that number by 5\n\t7.) Add your birthday day to the number (10 if the 10th, 21 if the 21st, etc.)");
		System.out.println("\nEnter your number: ");
		num = input.nextInt();
		input.close();
		
		num-=165; month = num/100; day = num%100;
		System.out.println("\n"+name+", your birthday is "+months.get(month-1)+" "+day+"! :P");
	}
}
