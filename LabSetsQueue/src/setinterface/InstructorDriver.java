package setinterface;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InstructorDriver
{
    public static void main(String[] args)
    {
        HashSet<Instructor> instructorHash = new HashSet();
        instructorHash.add(new Instructor("Bobb","Dylan",1));
        instructorHash.add(new Instructor("LastName","FN",2));
        instructorHash.add(new Instructor("fad","avc",3));
        
        for(Instructor x:instructorHash)
        {
            System.out.println(x);
        }
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the last name: ");
        String lastName = keyboard.nextLine();
        
        Instructor input = new Instructor(lastName,"",0);
        
        if(instructorHash.contains(input))
        {
            System.out.println("Intructor exists");
        }
        else
        {
            System.out.println("Instructor Does not exist");
        }
    }
}