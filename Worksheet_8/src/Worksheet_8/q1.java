package Worksheet_8;

public class q1
{
    public static void main(String[] args) 
    {
        ExamClockCheck exam0 = new ExamClockCheck(120, 20); 
        exam0.timeCheck();
        ExamClockCheck exam1= new ExamClockCheck(120, 50); 
        exam1.timeCheck();
        ExamClockCheck exam2 = new ExamClockCheck(120, 120); 
        exam2.timeCheck();
        ExamClockCheck exam3 = new ExamClockCheck(120, 130); 
        exam3.timeCheck();
    }
}
class ClockCheck 
{
    public static int trailNumber = 0;
    int allowedTime;
    public ClockCheck()
    {
        allowedTime = 0;
    }
    public ClockCheck(int at)
    {
        allowedTime = at;
    }
    
}
class ExamClockCheck extends ClockCheck
{
    int timeLeft; 
    public ExamClockCheck(int at, int tl)
    {
        super(at);
        timeLeft = tl; 
    }
    public void timeCheck()
    {
        try
        {
            if( allowedTime - timeLeft > 0) System.out.println(allowedTime -timeLeft +  " minutes left...");
            else if(allowedTime - timeLeft == 0) throw new Exception("Time's up..."); 
            else throw new Exception("Multiple try for the exam is not allowed..."); 
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            trailNumber++; 
            System.out.println("You checked the clock " + trailNumber + " time(s)" );
        }
    }
}
