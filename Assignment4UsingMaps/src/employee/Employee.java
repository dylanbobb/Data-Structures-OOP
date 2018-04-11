// This class models an employee
package employee;
public class Employee
{
    private int idNum;
    private String name;
    
    // 2 Argument Constructor
    public Employee(int idNum, String name)
    {
        this.idNum = idNum;
        this.name = name;
    }
    
    // String representation of Employee
    @Override
    public String toString()
    {
        return "ID: " + this.idNum + " Name: " + this.name;
    }

    /*
        hashCode() and equals() based off of idNUm to ensure that 2 employees cannot have the same ID number inside the HashMap.
    */
    @Override
    public int hashCode() 
    {
        int hash = 5;
        hash = 37 * hash + this.idNum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.idNum != other.idNum) {
            return false;
        }
        return true;
    }
    
    
}