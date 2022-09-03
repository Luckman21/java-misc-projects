import java.util.ArrayList;
import java.util.Hashtable;

public class Test2 {
	
	public static void main (String args[]) {
		
		ArrayList<Test3> cList = new ArrayList<Test3>();
		Hashtable<Test3, Integer> ht = new Hashtable<Test3, Integer>();
		
		Test3 T86 = new Test3("Toyota","86",300);
		Test3 BRZ = new Test3("Subaru","BRZ",300);
		
		cList.add(T86);
		cList.add(BRZ);
		ht.put(T86,3);
		ht.put(BRZ,5);
	
		System.out.println(T86);
		
		/*
		int[] iA = {1,1,1,1,1,1};
		int n = 0;
		
		try {
			for (int i=0;i<15;i++) {
				n+=iA[n];
			}
		}
		catch (Exception e) {
			n++;
		}
		finally {
			n++;
		}
		System.out.println(n);
		*/
		
		//System.out.println(cList.size() +" "+ ht.size());
		
		/*
		int[] al = {1,2,3,4,5};
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(5,"X");
		ht.put(2,"R");
		ht.put(3,"R");
		ht.put(4,"Y");
		ht.put(4,"X");
		System.out.println(ht.keySet());
		System.out.println(ht.values());
		
		double a = 2.5;
		int b = 3;
		int c = (int)a*b;
		System.out.println(c);
		
		boolean allPositive = true;
		System.out.println("All numbers are positive" + allPositive);
	
		System.out.println(T86.equals(BRZ));
		System.out.println(T86.toString());
		System.out.println(T86.hashCode());
		
		System.out.print("EECS");
		System.out.printf("%s", "1021");
		System.out.println("Midterm");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		System.out.println(name);
		
		for (int i = 0; i < name.length();i++) {
			System.out.println(name.substring(i,i+1));
		}
		*/
	}
}