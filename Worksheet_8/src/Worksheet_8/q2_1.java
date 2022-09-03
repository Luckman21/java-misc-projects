package Worksheet_8;

import java.util.Scanner;
import java.util.InputMismatchException;


public class q2_1 {
    
    public static void main(String[] args) {
    
        int num = getNumber(); 
        System.out.println("The entered number is: " + num);
        
    }

    public static int getNumber()
    {
        Scanner sc = new Scanner(System.in); 
        int input = 0; 
        boolean finished = false;
        while(!finished)
        {
            try
            {
                System.out.print("Enter a whole number: ");
                input = sc.nextInt(); 
                finished = true;
            }
            catch(InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Wrong Input, try again...");
            }
        }
        return input; 
    }
}
