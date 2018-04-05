package employee;

public class Employee
{
    private int empNum;
    private double salary;
    
    public Employee(int empNum, double salary)
    {
        this.empNum = empNum;
        this.salary= salary;
    }
    
    public void setEmpNum(int empNum)
    {
        this.empNum = empNum;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public int getEmpNum()
    {
        return this.empNum;
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    @Override
    public String toString()
    {
        return empNum + " " + salary;
    }
}