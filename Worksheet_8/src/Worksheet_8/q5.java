package Worksheet_8;

public class q5 {
    public static void main(String[] args) {

        Q4_5 obj1 = new Q4_5();
        obj1.printCount();
        Q5_5 obj2 = new Q5_5();
        obj2.printCount();
        Q6_5 obj3 = new Q6_5();
        obj3.printCount();
        
    }
}

class Q4_5
{
    static int counter = 0; 
    public Q4_5()
    {
        counter++;
    } 
    static void printCount()
    {
        System.out.println(counter);
    }
}

class Q5_5 extends Q4_5
{
    static int counter = 0; 
    public Q5_5()
    {
        counter++;
    }
    static void printCount()
    {
        System.out.println(counter);
    }
}
class Q6_5 extends Q4_5
{
    public Q6_5()
    {
        counter++;
    }
    static void printCount()
    {
        System.out.println(counter);
    }
}
