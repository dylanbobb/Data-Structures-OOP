// This class creates employees (To be stored in a HashMap)
// The key of this hashmap will be the employee number so that employees can be searched by their id number.(Key = idNum, Value = Employee)
package employee;
import java.util.HashMap;
public class AllEmployee
{
    // Creating the hashmap to store employees with key as idNum.
    static HashMap<Integer, Employee> employeeMap = new HashMap();
    public static void main(String[] args)
    {   
        // Inserting some example employees to the employeeMap.
        employeeMap.put(0,new Employee(0,"Dylan"));
        employeeMap.put(4,new Employee(4,"Bobb"));
        employeeMap.put(5,new Employee(5,"Sean"));
        employeeMap.put(3,new Employee(3,"Test")); 
        employeeMap.put(3,new Employee(3,"Carly")); // "Carly" will replace "Test" in the HashMap because 2 employees cannot have the same ID.
        
        /*
          Testing this class by searching for a few employees by their IdNum using the search method and printing the employee if it exists.
        */
        // Searching for employee #0. We expect this to work
        System.out.println("Searching for employee #0: ");
        search(0);
        
        // Searching for employee #2. We expect the does not exist message to be displayed because there is no employee #2.
        System.out.println("Searching for employee #2: ");
        search(2);
        
        // Lastly we will search for employee #3. We expect this to work
        System.out.println("Searching for employee #3: ");
        search(3);
    }
    
    // This method will lookup an employee idNUm in the hashmap and display the employee if they exist
    public static void search(int idNum)
    {
        // If the idNum exists, print the name
        if(employeeMap.containsKey(idNum))
        {
            System.out.println(employeeMap.get(idNum));
        }
        // Otherwise display an error
        else
        {
            System.out.println("Error: Employee does not exist");
        }
    }
}