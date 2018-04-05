package gradecalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args)
    {
        try
        {
            Scanner file = new Scanner(new File("D:\\WINTER 2018\\Data Structures & OOP\\GuidedLabIO\\src\\gradecalculator\\file.txt"));
            
            double sum = 0;
            int elements = 0;
            while(file.hasNextDouble())
            {
                sum += file.nextDouble();
                elements++;
            }
            
            System.out.println(sum/elements);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}