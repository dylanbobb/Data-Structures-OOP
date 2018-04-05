package course;

public class Student
{
    private int idNum;
    private Course[] courseArr = new Course[5];
    
    public void setIdNum(int idNum)
    {
        this.idNum = idNum;
    }
    
    public int getIdNum()
    {
        return this.idNum;
    }
    
    public Course getCourse(int i)
    {
        return this.courseArr[i];
    }
    
    public void setCourseArr(Course course, int i)
    {
        this.courseArr[i] = course;
    }
    
    public Student(int idNum, Course[] courseArr)
    {
        this.idNum = idNum;
        this.courseArr = courseArr;
    }
}