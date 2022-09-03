
public class ChangeMe {

	public int x;
	public String y;

	public static void changeMe(int a) {
		System.out.println("int");
		a *= 2;
	}

	public static void changeMe(Integer a) {
		System.out.println("Integer");
		a *= 2;
	}

	public static void changeMe(String a) {
		System.out.println("String");
		a = "world";
	}

	public static void changeMe(ChangeMe z) {
		z.x *= 2;
		z.y = "world";
	}

	public static void main(String[] args) {

		int b = 2;
		Integer B = new Integer(2); // Integer is just an object wrapper for the primitive
		String s = "hello";
		ChangeMe c = new ChangeMe();

		char data[] = { 'h', 'e', 'l', 'l', 'o' };
		String s2 = new String(data);

		c.x = 2;
		c.y = "hello";

// just sending in the value, not the variable
		System.out.println("before: " + b + " " + B + " " + s + " " + c.x + c.y);
		changeMe(b);
		changeMe(B);
		changeMe(s);

// this is sending in a reference to the class... not just a value
		changeMe(c);

		System.out.println("after: " + b + " " + B + " " + s + " " + c.x + c.y);

		data[0] = 'H';
		System.out.println(data);
		System.out.println(s2);

	}

}