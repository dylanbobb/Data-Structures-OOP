package course;

import java.util.Scanner;

public class InputGrades
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Student id number: ");
        int idNum = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter Course Id        : ");
        String id = keyboard.nextLine();
        System.out.print("Enter Credit Worth     : ");
        double credit = keyboard.nextDouble();
        System.out.print("Enter Grade            : ");
        keyboard.nextLine();
        char grade = keyboard.nextLine().charAt(0);
        Course[] courseArr = new Course[5];
        courseArr[0] = new Course(id,credit,grade);
        Student s1 = new Student(idNum,courseArr);
        
        System.out.println();
        System.out.println("Student ID Number: " + s1.getIdNum());
        System.out.println("Course Id        : " + s1.getCourse(0).getId());
        System.out.println("Credit Worth     : " + s1.getCourse(0).getCredit());
        System.out.println("Grade            : " + s1.getCourse(0).getGrade());
    }

}