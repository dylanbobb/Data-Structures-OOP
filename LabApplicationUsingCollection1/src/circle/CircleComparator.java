package circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle>
{
    @Override
    public int compare(Circle c1, Circle c2)
    {
        if(c1.getX() > c2.getX())
        {
            return 1;
        }
        if(c1.getX() == c2.getX())
        {
            return 0;
        }
        return -1;
    }
}