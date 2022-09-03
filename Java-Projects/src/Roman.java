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
import java.util.List;

public class Roman {

//CONSTRUCT OBJECTS

	private int num;
	private String rom;
	
	//Constructors to define object values and construct objects based on parameters
	public Roman() {
		this.num = 0;
		this.rom = "";
	}
	public Roman(int abc) {
		if (set(abc) == true) {
		this.num = abc;
		this.rom = convertToString(abc);
		}
		else {
			this.num = 0;
			this.rom = "";
		}
	}
	public Roman(String abc) {
		if (set(abc) == true) {
			this.rom = abc;
			this.num = convertToInt(abc);
			}
			else {
				this.num = 0;
				this.rom = "";
			}
	}
	
//CHECK IF ROMAN NUMERAL / NUMBER FITS RESTRICTIONS

	/**
	 * Checks to see if the input parameter for string to integer is between or includes 1 to 5000
	 * @param i Input 1 (String)
	 * @return boolean (true if conditions are met, otherwise, false)
	 */
	public static boolean set (String s) {
		if (Roman.convertToInt(s) >= 1 && Roman.convertToInt(s) <= 5000 && Roman.convertToString(Roman.convertToInt(s)).equals(s))
			return true;
		return false;
	}
	
	/**
	 * Checks to see if the input parameter for integer to string is between or includes 1 to 5000
	 * @param i Input 1 (int)
	 * @return boolean (true if conditions are met, otherwise, false)
	 */
	public static boolean set (int i) {
		if (i >= 1 && i <= 5000)
			return true;
		return false;
	}

//CONVERSIONS
	
	/**
	 * Used to convert Roman numerals to integers
	 * @param a Input 1 (String)
	 * @return an integer
	 */
	public static int convertToInt(String a) {
		
		/*
		 * This loop checks each substring of the string by converting each substring to
		 * a char. It then checks which letter it corresponds to in the array. If there
		 * is at least 1 character (example y) after the current character (example x),
		 * it checks the list to see if x is greater than y. If so, it does y-x and adds
		 * this value to the total. Otherwise, it just adds x to the total value.
		 */

		char[] rLet = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
		int[] rNum = { 1000, 500, 100, 50, 10, 5, 1 };
		int lastNum = 0;
		int b = 0;

		for (int i = 0; i < a.length(); i++) {
			for (int x = 0; x < rLet.length; x++) {
				if (a.charAt(i) == rLet[x]) {

					boolean subtract = false;
					if (i + 1 < a.length()) {
						for (int z = 0; z < x; z++) {
							if (a.charAt(i + 1) == rLet[z]) {
								if (lastNum == rNum[z] - rNum[x]) {
									return -1;
								}
								subtract = true;
								b += rNum[z] - rNum[x];
								lastNum = rNum[z] - rNum[x];
								i++;
								break;
							}
						}
						if (subtract == false) {
							b += rNum[x];
							lastNum = rNum[x];
						}
					} else {
						b += rNum[x];
						lastNum = rNum[x];
					}
				}
			}
		}
		return b;
	}

	
	/**
	 * Used to convert integers to Roman numerals
	 * 
	 * @param a Input 1 (int)
	 * @return A string value (output)
	 */
	public static String convertToString(int a) {

		/*
		 * This method takes in the parameter a and checks to see the biggest roman
		 * number it can subtract from a with a total greater or equal to 0. If this is
		 * possible, the corresponding roman letter is added to a list. Otherwise, the
		 * loop goes through a secondary check determine if that number subtracted from
		 * another roman number will have a difference with a total greater or equal to
		 * 0. If this is possible, there is a third loop that checks if this difference
		 * is equal to another roman number. If it is, that roman number is subtracted
		 * from the total and added to the list. Otherwise, it subtracts the other total
		 * and adds the two subtracting roman numbers. This is done until a = 0.
		 */

		String[] rLet = { "M", "D", "C", "L", "X", "V", "I" };
		int[] rNum = { 1000, 500, 100, 50, 10, 5, 1 };
		List<String> lets = new ArrayList<String>();
		String output = "";

		while (a > 0) {
			for (int i = 0; i < rNum.length; i++) {
				boolean xtra = false;
				int x = 1;

				if (a - rNum[i] >= 0) {
					a -= rNum[i];
					lets.add(rLet[i]);
					break;
				}

				else {
					if (rLet[i] == "X") {
						if (a - 9 >= 0) {
							a -= 9;
							lets.add("IX");
						}
					} else if (rLet[i] == "I") {
						continue;
					} else {

						if (rLet[i] == "M" || rLet[i] == "C" || rLet[i] == "X") {
							x = 2;
						}

						if (a - (rNum[i] - rNum[i + x]) >= 0) {
							for (int z = 0; z < rNum.length; z++) {
								if (rNum[i] - rNum[i + x] == rNum[z]) {
									a -= rNum[z];
									lets.add(rLet[z]);
									xtra = true;
									break;
								}
							}
							if (xtra == false) {
								a -= (rNum[i] - rNum[i + x]);
								lets.add(rLet[i + x]);
								lets.add(rLet[i]);
							}
						}
					}
				}
			}
		}
		// https://stackoverflow.com/questions/599161/best-way-to-convert-an-arraylist-to-a-string

		/*
		 * This small loop takes the list we created and append values to above and
		 * condenses it into one string by taking each character and adding it to a
		 * blank string.
		 */
		for (String s : lets)
			output += s;
		return output;
	}
		
//RETURN VALUES TO OBJECTS
	
	/**Returns the value stored in the private instance variable num
	 * 
	 * @param s Input 1 (String)
	 * @return Private instance variable num (i)
	 */
	public int toInt() {
		return this.num;
	}
	
	/**Returns the value stored in the private instance variable rom
	 * 
	 * @param s Input 1 (String)
	 * @return Private instance variable rom (s)
	 */
	public String toRoman() {
		return this.rom;
	}
	
//ADDITION / SUBTRACTION METHODS
	
	/**
	 * Calculates the sum of two Roman variables and returns the value
	 * @param a Roman Number 1 (Roman)
	 * @param b Roman Number 2 (Roman)
	 * @return Addition: Roman Number 1 + Roman Number 2
	 */
	public static int add(Roman a, Roman b) {
		return a.toInt() + b.toInt();
	}
	
	/**
	 * Calculates the difference of two Roman variables and returns the value
	 * @param a Roman Number 1 (Roman)
	 * @param b Roman Number 2 (Roman)
	 * @return Subtraction: Roman Number 1 - Roman Number 2
	 */
	public static int sub(Roman a, Roman b) {
		return a.toInt() - b.toInt();
	}
}