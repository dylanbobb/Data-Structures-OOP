package circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Application
{
    public static void display(Collection list)
    {
        for(Object x:list)
        {
            System.out.println(x);
        }
    }
    
    public static void main(String[] args)
    {
        Circle[] arrayX = new Circle[4];
        arrayX[0] = new Circle(1,2,3);
        arrayX[1] = new Circle(3,7,2);
        arrayX[2] = new Circle(4,5,78);
        arrayX[3] = new Circle(3,6,45.32);
        System.out.println("arrayX : ");
        display(Arrays.asList(arrayX));
        
        ArrayList<Circle> arrayY = new ArrayList(Arrays.asList(arrayX));
        System.out.println("arrayY : ");
        display(arrayY);
        
        Collections.sort(arrayY);
        System.out.println("Radius Sorted arrayY : ");
        display(arrayY);
        
        LinkedList<Circle> arrayZ = new LinkedList(arrayY);
        Collections.shuffle(arrayZ);
        System.out.println("Shuffled arrayZ : ");
        display(arrayZ);
        Collections.sort(arrayZ, new CircleComparator());
        System.out.println("X Sorted arrayZ : ");
        display(arrayZ);
        Collections.reverse(arrayZ);
        System.out.println("Reversed X Sorted arrayZ : ");
        display(arrayZ);
        
        System.out.println("Maximum Circle");
        System.out.println(Collections.max(arrayZ));
    }
}