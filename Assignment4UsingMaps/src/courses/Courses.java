package courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Courses
{
    public static void main(String[] args)
    {
        ArrayList<String> mixedCourseList = new ArrayList();
        mixedCourseList.add("1 CS100");
        mixedCourseList.add("2 MATH210");
        mixedCourseList.add("2 CS105");
        mixedCourseList.add("1 CS200");
        
        HashMap<Integer,ArrayList<String>> students = new HashMap();

        for(String x:mixedCourseList)
        {
            Scanner sc = new Scanner(x);
            int studentNumber = Integer.parseInt(sc.next());
            String courseName = sc.next();
            
            ArrayList<String> courseList = new ArrayList();
            if(students.containsKey(studentNumber))
            {
                courseList = students.get(studentNumber);
                courseList.add(courseName);
                students.put(studentNumber, courseList);
            }
            else
            {
                courseList.add(courseName);
                students.put(studentNumber, courseList);
            }
        }
        
        students.forEach((k,v) -> System.out.println(k + "\t" + v));
    }
}