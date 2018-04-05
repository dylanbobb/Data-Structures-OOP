package employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadEmployees
{
    public static void main(String[] args)
    {
        ArrayList<Employee> empList = new ArrayList();
        try
        {
            Scanner file = new Scanner(new File("D:\\WINTER 2018\\Data Structures & OOP\\employees.txt"));
            
            while(file.hasNext())
            {
                String line = file.nextLine();
                Scanner parse = new Scanner(line);
                parse.useDelimiter(":");
                String idString = parse.next();
                String firstName = parse.next();
                String lastName = parse.next();
                String city = parse.next();
                
                try
                {
                    int id = Integer.parseInt(idString);
                    int salary = parse.nextInt();
                    empList.add(new Employee(id,firstName,lastName,city,salary));
                }
                catch(InputMismatchException e)
                {
                    System.out.println( "Error in line: " + line + "; line ignored" );   
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        Employee highSalary = empList.get(0);
        for(int i = 1; i < empList.size(); i++)
        {
            if(empList.get(i).getSalary() > highSalary.getSalary())
            {
                highSalary = empList.get(i);
            }
        }
        
        System.out.println(highSalary);
    }
}