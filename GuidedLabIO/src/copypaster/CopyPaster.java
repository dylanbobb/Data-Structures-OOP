package copypaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyPaster
{
    public static void main(String[] args)
    {
       try
       {
           Scanner file = new Scanner(new File("D:\\WINTER 2018\\Data Structures & OOP\\GuidedLabIO\\src\\copypaster\\origin.txt"));
           
           int i = 1;
           File destination = new File("D:\\WINTER 2018\\Data Structures & OOP\\GuidedLabIO\\src\\copypaster\\destination.txt");
           try (PrintWriter printer = new PrintWriter(destination))
           {
               while(file.hasNextLine())
               {
                   String line = file.nextLine();
                   printer.println(i + " " + line);
                   i++;
               }
           }
       }
       catch(FileNotFoundException e)
       {
           System.out.println("File not found");
       }
    }
}