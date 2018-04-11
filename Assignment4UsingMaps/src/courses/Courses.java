package courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Courses
{
    public static void main(String[] args)
    {
        ArrayList<Student> mixedCourseList = new ArrayList();
        mixedCourseList.add(new Student(1,"CS100"));
        mixedCourseList.add(new Student(2,"MATH210"));
        mixedCourseList.add(new Student(2,"CS105"));
        mixedCourseList.add(new Student(1,"CS200"));
        
        HashMap<Integer,ArrayList<String>> students = new HashMap();

        for(Student x:mixedCourseList)
        {
            int studentNumber = x.getId();
            String courseName = x.getCourse();
            
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
        
        students.forEach((k,v) -> 
        {
            Collections.sort(v);
            System.out.println(k + "\t" + v);
        });
    }
}