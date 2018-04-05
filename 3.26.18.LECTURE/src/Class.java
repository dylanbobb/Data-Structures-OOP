
import java.util.HashSet;
import java.util.Set;


public class Class
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet();
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        
        System.out.println(set);
        
        for(String s:set)
        {
            System.out.print(s.toUpperCase() + " ");
        }
    }
}