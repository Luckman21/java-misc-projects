/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class Foo {

	/**
	 * Takes in a string value and counts the number of lower case letters in the string
	 * @param a Input 1 (String)
	 * @return The number of lower case letters found in the string (int)
	 */
	public static int foo1(String a) {
		
		int b = 0;
		
		String [] lets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		for (int i = 0; i < a.length();i++) {
			for (int j = 0; j < lets.length;j++) {
				if (a.substring(i,i+1).equals(lets[j])) {
					b+=1;
					break;
				}
			}
		}
		return b;
	}
	
	/**
	 * Takes in a string and character value and counts the number of times the character appears in the string
	 * @param a Input 1 (String)
	 * @param c Input 2 (char)
	 * @return The number of instances the character is found within the string (int)
	 */
	public static int foo2(String a, char c) {
		
		int b = 0; String d = "";
		d+=c;
		
		for (int i = 0; i < a.length();i++) {
			if (a.substring(i,i+1).equals(d)) {
				b+=1;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		String word1 = "Hello World";
		String word2 = "supercalifragilisticexpialidocious";
		char letter = 'i';
		
		System.out.println(foo1(word1));
		System.out.println(foo2(word2, letter));
	}
}