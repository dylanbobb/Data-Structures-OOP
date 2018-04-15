// This class will model a student with an id and a course
package courses;
public class Student
{
    private int id;
    private String course;

    // 2 argument constructor
    public Student(int id,String course)
    {
        this.id = id;
        this.course = course;
    }


    // Getters
    public int getId()
    {
        return this.id;
    }
    
    public String getCourse()
    {
        return this.course;
    }
}