package parkeruniversity;

public class UndergraduateStudent extends Student
{
    public UndergraduateStudent(int id, String lastName)
    {
        super(id,lastName);
        this.tuition = 4000;
    }
    
    @Override
    public void setTuition(double tuition)
    {
        this.tuition = tuition;
    }
}