package course;

import java.util.Scanner;

public class InputGrades2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Student[] studentArr = new Student[4];
        Course[] courseArr = new Course[5];
        for(int i = 0; i < 4; i++)
        {
            System.out.print("Enter ID for student #" + (i+1) + ": ");
            int idNum = keyboard.nextInt();
            keyboard.nextLine();
            for(int k = 0; k < 5; k++)
            {
                System.out.print("Enter course ID #" + (k+1) + ": ");
                String id = keyboard.nextLine();
                System.out.print("Enter credit worth for course #" + (k+1) + ": ");
                double credit = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.print("Enter grade for course #" + (k+1) + ": ");
                char grade = keyboard.nextLine().toUpperCase().charAt(0);
                while(grade != 'A' &&
                      grade != 'B' &&
                      grade != 'C' &&
                      grade != 'D' &&
                      grade != 'F')
                {
                    System.out.println("Error: Invalid grade");
                    System.out.println("Please try again");
                    System.out.print("Enter grade for course #" + (k+1) + ": ");
                    grade = keyboard.nextLine().toUpperCase().charAt(0);
                }
                courseArr[k] = new Course(id,credit,grade);
            }
            studentArr[i] = new Student(idNum,courseArr);
        }
    }
}