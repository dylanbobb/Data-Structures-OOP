package usinglinkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class TwoLinkedHashSet
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> set1 = new LinkedHashSet();
        LinkedHashSet<String> set2 = new LinkedHashSet();
        
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");
        
        LinkedHashSet<String> set1Clone1 = (LinkedHashSet<String>)set1.clone();
        LinkedHashSet<String> set1Clone2 = (LinkedHashSet<String>)set1.clone();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");
        
        set1.addAll(set2);
        set1Clone1.removeAll(set2);
        set1Clone2.retainAll(set2);
        
        System.out.println("Uninion: " + set1 + "\n");
        System.out.println("Difference: " + set1Clone1 + "\n");
        System.out.println("Intersection: " + set1Clone2);
    }
}