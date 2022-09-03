
public class Loops_and_Nesting {
	public static void main (String args[]) {
	
		//counted loops (for) and conditional loops (while)
		//if, else if and else are conditional statements
		// +,-,*,/,%,<,>,==,!=,<=,>=,<<,>>
		
		int a = (int)(Math.random() * 100 + 1);
		int b = (int)(Math.random() * 100 + 1);
		int c = a;
		
		if (a == b) {
			System.out.println("Path #1: "+a+" | "+b);
		}
		
		else if (a > b) {
			
			for (a = c; a >= b;a+=1) {
				b+=2;
				System.out.println("Path 2: "+a+" | "+b);
			}
		}
		
		else if (a < b){
			
			while (a <= b) {
				a+=2;b+=1;
				System.out.println("Path 3: "+a+" | "+b);
			}
		}
		
		else {
			System.out.println("Error");
		}
	}
	
}
