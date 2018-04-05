package setinterface;

import java.util.Objects;

public class Instructor
{
    private String lastName;
    private String firstName;
    private int officeNo;
    
    public Instructor(String lastName,String firstName,int officeNo)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.officeNo = officeNo;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    @Override
    public String toString()
    {
        return "First Name: " + this.firstName + " Last Name: " + this.lastName + " Office: " + this.officeNo;
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.lastName);
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
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.lastName, other.lastName)) 
        {
            return false;
        }
        return true;
    }
    
    
}