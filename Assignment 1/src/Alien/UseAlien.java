package alien;

import java.util.ArrayList;

public class UseAlien
{
    public static void main(String[] args)
    {
        ArrayList<Alien> list = new ArrayList(); 
        list.add(new Martian("Green",20));
        list.add(new Jupiterian("Blue",17));
        list.add(new Jupiterian("Red",50));
        
        list.forEach((x) -> {
            System.out.println(x);
            System.out.println();
    });
    }
}