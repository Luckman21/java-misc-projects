import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
public class ReadData {
 	public static void main (String[] args) {
      		
 		// Declaring a BufferedReader object
      	BufferedReader in;
      	List<String> info = new ArrayList<String>();
      	String[] information = {"First Name","Last Name","Email","Phone Number","Address","City","Province","Postal Code"};
      	

		try {
			String s = " ";
			in = new BufferedReader(new FileReader("C:\\Users\\dragu\\OneDrive\\Documents\\text.txt"));

			while (s != null) {
				try {
					s = in.readLine();
					if (s != null) {
						int x = 0;
						
						for (int i = 0; i < s.length();i++) {
							if (s.substring(i,i+1).equals(",")) {
								info.add(s.substring(x,i));
								x=i+1;
							}
						}
					}

				} catch (IOException e) {
					// Error code goes here when an I/O exception occurs
					System.out.println("I/O ERROR OCCURRED");

				} catch (NullPointerException e) {
					// Error code goes here when a null pointer is being
					// accessed.

					// for example when you're trying to output the length
					// of a null String
					System.out.println("NULL POINTER ERROR OCCURRED");
				}
			}
		} catch (FileNotFoundException e) {
			// Error code goes here when the file is not found
			System.out.println("FILE NOT FOUND");
		}
		for (int i = 0; i < info.size();i++) {
			System.out.println(information[i]+": "+info.get(i));
		}
	}
}
