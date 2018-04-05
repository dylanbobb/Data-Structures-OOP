package employee;

public class Employee
{
    private int id;
    private String firstName;
    private String lastName;
    private String city;
    private int salary;
    
    public int getSalary()
    {
        return this.salary;
    }
    
    public Employee(int id,String firstName,String lastName,String city,int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.salary = salary;
    }
    
    @Override
    public String toString()
    {
        return "id         : " + id        + "\n" +
               "First Name : " + firstName + "\n" +
               "Last Name  : " + lastName  + "\n" +
               "City       : " + city      + "\n" + 
               "Salary     : " + salary    ;
    }
}