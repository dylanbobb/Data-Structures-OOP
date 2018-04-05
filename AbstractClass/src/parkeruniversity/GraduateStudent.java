package parkeruniversity;

public class GraduateStudent extends Student
{
    public GraduateStudent(int id, String lastName)
    {
        super(id,lastName);
        this.tuition = 6000;
    }
    
    @Override
    public void setTuition(double tuition)
    {
        this.tuition = tuition;
    }
}