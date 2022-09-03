import java.util.Arrays;

public class Test3 {

	public static int func1(int[] input, int s, int e) {
		if (s == e)
		return input[s];
		else {
			System.out.println(s);
			System.out.println((s+e)/2);
			System.out.println((s+e)/2+1);
			System.out.println(e);
			System.out.println("______");
			return func1(input, s, (s+e)/2) + func1(input, (s+e)/2+1, e);
		}
	}
	
	public static void main(String[] args) {
		/*
		String [] pTypeList = {"Normal","Fire","Water","Grass","Electric","Ice","Fighting","Poison","Ground","Flying","Psychic","Bug","Rock","Ghost","Dragon","Dark","Steel","Fairy"};
		String [] equalMU = {""};
		
		for (int i = 0; i < pTypeList.length-5;i++) {
			equalMU = Arrays.copyOf(equalMU, equalMU.length+1);
			equalMU[equalMU.length-1] = pTypeList[i];
			//System.out.println(pTypeList[i]);
		}
		for (int i = 0; i < pTypeList.length-5;i++) {
			System.out.println(equalMU[i]);
		}*/
		
		int[] input = {1,2,3,4,5};
		System.out.println(func1(input,3,4));
	}
}