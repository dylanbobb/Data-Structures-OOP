// This class creates employees (To be stored in a HashMap)
// The key of this hashmap will be the employee number so that employees can be searched by their id number.(Key = idNum, Value = Employee)
import java.util.HashMap;
public class AllEmployee
{
    public static void main(String[] args)
    {
        // Creating the hashmap to store employees with key as idNum.
        HashMap<Integer, Employee> employeeMap = new HashMap();
        
        // Inserting some example employees to the employeeMap.
        employeeMap.put(0,new Employee(0,"Dylan"));
        employeeMap.put(4,new Employee(4,"Bobb"));
        employeeMap.put(5,new Employee(5,"Sean"));
        employeeMap.put(3,new Employee(3,"Carly"));
    }
}