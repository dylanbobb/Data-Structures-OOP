package parkeruniversity;

public abstract class Student
{
    protected int id;
    protected String lastName;
    protected double tuition;
    
    public Student(int id, String lastName)
    {
        this.id = id;
        this.lastName = lastName;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public abstract void setTuition(double tuition);

    
    public int getId()
    {
        return this.id;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public double getTuition()
    {
        return this.tuition;
    }
    
    @Override
    public String toString()
    {
        return id + " " + lastName + " " + tuition;
    }
}