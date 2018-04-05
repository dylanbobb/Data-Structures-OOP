package arraylistdemo;
import java.util.ArrayList;
public class ArrayListDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList();
        names.add("Samuel");
        display(names);
        names.add("Daniel");
        display(names);
        names.add("Zoe");
        display(names);
        names.add(2, "Veronica");
        display(names);
        names.remove(1);
        display(names);
        names.set(0, "Jose");
        display(names);
        System.out.println("\n" + names);
    }
    
    public static void display(ArrayList<String> names)
    {
        System.out.println("\nThe size of the actual list is " + names.size());
        for(int x = 0; x < names.size(); x++)
        {
            System.out.println("Position " + x + " Name: " + names.get(x));
        }
    }
}