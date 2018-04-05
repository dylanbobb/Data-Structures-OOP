package parkeruniversity;

public class StudentAtLarge extends Student
{
    public StudentAtLarge(int id, String lastName)
    {
        super(id,lastName);
        this.tuition = 2000;
    }
    
    @Override
    public void setTuition(double tuition)
    {
        this.tuition = tuition;
    }
}