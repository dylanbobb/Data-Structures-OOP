package linecounter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter
{
    public static void main(String[] args)
    {
        try
        {
            Scanner file = new Scanner(new File("D:\\WINTER 2018\\Data Structures & OOP\\GuidedLabIO\\src\\linecounter\\file.txt"));
            int i = 0;
            while(file.hasNextLine())
            {
                i++;
                file.nextLine();
            }
            System.out.println(i);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }
}