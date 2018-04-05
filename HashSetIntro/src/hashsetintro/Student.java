package hashsetintro;

public class Student
{
    private int idNumber;
    private String name;
    
    public Student(int idNumber, String name)
    {
        this.idNumber = idNumber;
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return "Name: " + this.name + " ID: " + this.idNumber;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 43 * hash + this.idNumber;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Student other = (Student) obj;
        if (this.idNumber != other.idNumber) 
        {
            return false;
        }
        return true;
    }
    
    
}