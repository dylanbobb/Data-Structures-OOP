package exceptiontest;
import java.util.Scanner;

public class ExceptionTest
{
    public static void main(String[] args)
    {
        try
        {
            Scanner keyBoard = new Scanner(System.in);
            int x = 25;
            double result;
            System.out.println("Please enter a value");
            int y = keyBoard.nextInt();
            result = x/y;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}