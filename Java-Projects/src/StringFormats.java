
public class StringFormats {

	public static void main(String[] args) {
		
		//int d = Integer.MAX_VALUE;
		//long b = Long.MAX_VALUE;
		String a = "hello world";
		
		for (int i = 0; i < a.length(); i++)
			System.out.println(a.substring(0,i));
		
		//System.out.println(a[0]);
		System.out.println(a.charAt(0));
		System.out.println(a.substring(5));
		//System.out.println(a.substring(5,1));
		System.out.println(a.substring(5,10));
		
		
		/*// These two have the same value
		new String("test").equals("test") // --> true 
		
		// ... but they are not the same object
		new String("test") == "test" // --> false 
		
		// ... neither are these
		new String("test") == new String("test") // --> false 
		
		// ... but these are because literals are interned by 
		// the compiler and thus refer to the same object
		"test" == "test" // --> true 
		
		// ... string literals are concatenated by the compiler
		// and the results are interned.
		"test" == "te" + "st" // --> true
		
		// ... but you should really just call Objects.equals()
		Objects.equals("test", new String("test")) // --> true
		Objects.equals(null, "test") // --> false*/

	}

}
