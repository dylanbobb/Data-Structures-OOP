package hashsetintro;

import java.util.Arrays;
import java.util.HashSet;

public class StudentDemo
{
    public static void main(String[] args)
    {
        Student[] arr = {new Student(0,"Dylan"),new Student(0,"Bobb"),new Student(1,"adas"),
                         new Student(2,"abcde"),new Student(3,"aaaa"),new Student(4,"a")};
        for(Student x:arr)
        {
            System.out.println(x);
        }
        
        System.out.println("\nHashSet:");
        HashSet<Student> hash = new HashSet(Arrays.asList(arr));
        System.out.println(hash);
    }
}