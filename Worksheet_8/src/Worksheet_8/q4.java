package Worksheet_8;

import java.util.Objects;

public class q4 {
    public static void main(String[] args) {
        Q0_2 obj3 = new Q0_2();
        Q0_2 obj4 = new Q0_2();
        System.out.println(obj3.hashCode() == obj4.hashCode());

        Q0_3 obj5 = new Q0_3();
        Q0_3 obj6 = new Q0_3();
        System.out.println(obj5.hashCode() == obj6.hashCode());

    }
}

class Q0_2
{
    int item1; 
    double item2;
    public int hashCode()
    {
        return Objects.hash(item1,item2);
    }
}

class Q0_3
{
    int item1;
    double item2;
}
