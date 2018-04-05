
package employee;
public class EmployeeDriver {
    public static void main(String[] args)
    {
        Employee[] empArr = new Employee[5];
        int empNum = 10;
        double startingSalary = 30000;
        
        for(int i = 0; i < 3; i++)
        {
            empArr[i] = new Employee(empNum, startingSalary);
            empNum += 10;
        }
        
        startingSalary += 500;
        empNum += 10;
        
        for(int i = 3; i < 5; i++)
        {
            empArr[i] = new Employee(empNum, startingSalary);
            empNum += 20;
            startingSalary += 500;
        }
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println(empArr[i]);
        }
    }
}
