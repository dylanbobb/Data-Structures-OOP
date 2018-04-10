// This class creates employees (To be stored in a HashMap)
// The key of this hashmap will be the employee number so that employees can be searched by their id number.(Key = idNum, Value = Employee)
package employee;
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
        
        /*
          Testing this class by searching for a few employees by their IdNum and printing the employee if it exists.
        */
        // The logic behind this search is: if the employee number is found, the Employee will be printed using toString(). If it does not exist, a does not exist message will be printed.
        // Searching for employee #0
        System.out.println("Searching for employee #0: ");
        if(employeeMap.containsKey(0)) // Checking if employee #0 exists
        {
            System.out.println(employeeMap.get(0)); // If it does exist, print the employee. IN THIS CASE WE EXPECT THIS TO HAPPEN
        }
        else
        {
            System.out.println("Employee #0 does not exist"); // Otherwise, print a message saying the employee does not exist.
        }
        
        // Searching for employee #2. We expect the does not exist message to be displayed because there is no employee #2.
        System.out.println("Searching for employee #2: ");
        if(employeeMap.containsKey(2)) // Checking if employee #2 exists
        {
            System.out.println(employeeMap.get(2)); // If it does exist, print the employee.
        }
        else
        {
            System.out.println("Employee #2 does not exist"); // Otherwise, print a message saying the employee does not exist. IN THIS CASE WE EXPECT THIS TO HAPPEN
        }
        
        // Lastly we will search for employee #3
        System.out.println("Searching for employee #3: ");
        if(employeeMap.containsKey(3)) // Checking if employee #3 exists
        {
            System.out.println(employeeMap.get(3)); // If it does exist, print the employee. IN THIS CASE WE EXPECT THIS TO HAPPEN
        }
        
        // TODO: FINISH SEARCH
    }
}