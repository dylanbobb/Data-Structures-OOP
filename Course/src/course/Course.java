package course;

public class Course
{
    private String id;
    private double credit;
    private char grade;
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public void setCredit(double credit)
    {
        this.credit = credit;
    }
    
    public void setGrade(char grade)
    {
        this.grade = grade;
    }
    
    public String getId()
    {
        return this.id;
    }
    
    public double getCredit()
    {
        return this.credit;
    }
    
    public char getGrade()
    {
        return this.grade;
    }
    
    public Course(String id, double credit, char grade)
    {
        this.id = id;
        this.credit = credit;
        this.grade = grade;
    }
}