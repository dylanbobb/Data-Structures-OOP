package courses;
public class Student
{
    private int id;
    private String course;
    
    public Student(int id,String course)
    {
        this.id = id;
        this.course = course;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public String getCourse()
    {
        return this.course;
    }
}