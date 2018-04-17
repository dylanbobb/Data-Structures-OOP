package courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// This class will create a hashmap of courses based off an arraylist of students.
public class Courses
{
    public static void main(String[] args)
    {
        // Create an arraylist of students and add some values to it.
        ArrayList<Student> mixedCourseList = new ArrayList();
        mixedCourseList.add(new Student(1,"CS100"));
        mixedCourseList.add(new Student(2,"MATH210"));
        mixedCourseList.add(new Student(2,"CS105"));
        mixedCourseList.add(new Student(1,"CS200"));

        // Create a hasmap to store the students
        HashMap<Integer,ArrayList<String>> students = new HashMap();

        // Step through each element of the arraylist
        for(Student x:mixedCourseList)
        {
            // Get the student number and course name at our current indec
            int studentNumber = x.getId();
            String courseName = x.getCourse();
            
            // Create a temporary arraylist of strings to store courses we need to push into the hashmap
            ArrayList<String> courseList = new ArrayList();
            
            // If the student number at our current index already exists, we simply add the course to its value
            if(students.containsKey(studentNumber))
            {
                courseList = students.get(studentNumber);
                courseList.add(courseName);
                students.put(studentNumber, courseList);
            }
            // Otherwise, we create a new entry in the hashmap with the studentNumber and the course
            else
            {
                courseList.add(courseName);
                students.put(studentNumber, courseList);
            }
        }
        
        System.out.println("Printing hashmap ordered by key");
        students.forEach((k,v) -> System.out.println(k + "\t" + v));
        
        
        System.out.println("Printing hashmap ordered by key and by course name");
        students.forEach((k,v) -> 
        {
            Collections.sort(v);
            System.out.println(k + "\t" + v);
        });
    }
}