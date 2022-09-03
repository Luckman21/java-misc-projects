/**
 COPYRIGHT Luqmaan Irshad 2019

 https://www.youtube.com/channel/UC-Hn7po9Q7fAW08nPHjvYzg
  _
 | |    _   _   ______    ___  ___   ______   ______   ___  __
 | |   | | | | /  _   \  |   \/   | /  __  \ /  __  \ |   \ | |
 | |__ | |_| | | (_)   / | |\  /| | | (__) | | (__) | | |\ \| |
 |____| \___/  \____/\_\ |_| \/ |_| |_|  |_| |_|  |_| |_| \___|
 */

public class MathFunctions {
	
	/**
	 * Finds the factorial of n.
	 * @param n Input 1 (long)
	 * @return n*factorial(n-1) while n > 0.  When n = 0, it returns 1.
	 */
	public static long factorial(long n) {
		if (n == 0) 
			return 1;
		return n*factorial(n-1);
	}

	/**
	 * Returns all the possible combinations of a number.
	 * @param n Input 1 (long)
	 * @param r Input 2 (long)
	 * @return combinations(n-1,r) + combinations(n-1,r-1).  If(n == r or r == 0, returns 1.
	 */
	public static long combinations(long n, long r) {
		if (r > n)
			return r;
		else if (n == r || r == 0)
			return 1;
		return combinations(n-1,r) + combinations(n-1,r-1);
		//Do a not possible statement
	}

	/** 
	 * Finds the greatest common factor (GCD) of 2 numbers.
	 * @param m Input 1 (long)
	 * @param n Input 2 (long)
	 * @return gcd(n,m%n).  If n = 0, returns m.
	 */
	public static long gcd(long m, long n) {
		 if (n == 0)
			 return m;
		 return gcd(n,m%n);
	}

	/**
	 * Finds the power of x^n.
	 * @param x Input 1 (long)
	 * @param n Input 2 (long)
	 * @return x^(n-1)*x
	 */
	public static long power(long x, long n) {
		System.out.println(x+", "+n);
		if (n == 0)
			return 1;
		return x*power(x,n-1);
	}

	/**
	 * Returns n numbers of the fibonacci sequence.
	 * @param n Input 1 (long)
	 * @return fibonacci(n-1)+fibonacci(n-2)
	 */
	public static long fibonacci(long n) {
		if (n == 2 || n == 1)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
		
	}
	public static void main(String[] args) {
		//System.out.println(factorial(500)+"\n"+combinations(14,2)+"\n"+gcd(24,10)+"\n"+power(5,2)+"\n"+fibonacci(6));
		System.out.println(power(5,2));
	}
}
