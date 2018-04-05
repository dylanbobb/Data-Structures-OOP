package point;

import java.util.Comparator;

public class PointComparator implements Comparator<Point>
{
    @Override
    public int compare(Point p1, Point p2)
    {
        if(p1.getY() > p2.getY())
        {
            return 1;
        }
        else if(p1.getY() == p2.getY())
        {
            if(p1.getX() > p2.getX())
            {
                return 1;
            }
            else if(p1.getX() == p2.getX())
            {
                return 0;
            }
            return -1;
        }
        return -1;
    }
}