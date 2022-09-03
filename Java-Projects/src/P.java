
public class P {

	/*
	public static boolean en (int n) {
		if (n%2 == 0) 
			return true; 
		return false;
	}*/
	
	public static int goo (int a) {
		if (a == 1)
			return 0;
		return goo (a-1);
	}
	
	public static void main (String[] args) {
		
		int x = 3;
		System.out.println (goo (x));
		/*for (int i = 0; i < 10; i++) {
			if (en(i)) 
				System.out.println(i+" true");
			System.out.println(i+" not true");
		}*/
	}
	
}
