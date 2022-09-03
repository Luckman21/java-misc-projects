/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class Test {
	
	public static void main(String args[]) {
		
		//Objects
		
		Roman numeral1 = new Roman("MMM");
		Roman number1 = new Roman(21);
		Roman numeral2 = new Roman("XI");
		Roman number2 = new Roman(20);
		
		//Addition test cases
		
		if (Roman.set(numeral1.toRoman()) == true && Roman.set(numeral2.toRoman()) == true) {
			if (Roman.set(Roman.add(numeral1,numeral2)) == true) {
				Roman def = new Roman(Roman.add(numeral1,numeral2));
				System.out.println(def.toRoman()); 
			}
			else
				System.out.println("Invalid Roman numeral answer");
		}
		else 
			System.out.println("Invalid Roman numeral entered");
		
		if (Roman.set(number1.toInt()) == true && Roman.set(number2.toInt()) == true) {
			if (Roman.set(Roman.add(number1,number2)) == true) {
				Roman def = new Roman(Roman.add(number1,number2));
				System.out.println(def.toInt());  
			}
			else
				System.out.println("Invalid number answer");
		}
		else 
			System.out.println("Invalid number entered");
	
		//Subtraction test cases
	
		if (Roman.set(numeral1.toRoman()) == true && Roman.set(numeral2.toRoman()) == true) {
			if (Roman.set(Roman.sub(numeral1,numeral2)) == true) {
				Roman def = new Roman(Roman.sub(numeral1,numeral2));
				System.out.println(def.toRoman()); 
			}
			else
				System.out.println("Invalid Roman numeral answer");
		}
		else 
			System.out.println("Invalid Roman numeral entered");
		
		if (Roman.set(number1.toInt()) == true && Roman.set(number2.toInt()) == true) {
			if (Roman.set(Roman.sub(number1,number2)) == true) {
				Roman def = new Roman(Roman.sub(number1,number2));
				System.out.println(def.toInt());  
			}
		else
			System.out.println("Invalid number answer"); 
		}
		else 
			System.out.println("Invalid number entered");
	}
}