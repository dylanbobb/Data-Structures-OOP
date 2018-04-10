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
}