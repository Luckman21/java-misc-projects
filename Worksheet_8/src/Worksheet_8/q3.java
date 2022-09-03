package Worksheet_8;

public class q3 {
    
    public static void main(String[] args) {

        Q0_1 obj1 = new Q0_1(10, 24.3);
        Q0_1 obj2 = new Q0_1(10, 24.3); 
        System.out.println(obj1.equals(obj2));
        
    }
}

class Q0_1
{
    int item1;
    double item2; 
    public Q0_1()
    {
        item1 = 0;
        item2 = 0.0;
    }
    public Q0_1(int first, double second)
    {
        item1 = first;
        item2 = second;
    }
}

