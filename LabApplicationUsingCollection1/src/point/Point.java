package point;

public class Point implements Comparable<Point>
{
    private int x;
    private int y;
    
    @Override
    public int compareTo(Point o)
    {
        if(this.x > o.x)
        {
            return 1;
        }
        else if(this.x == o.x)
        {
            if(this.y > o.y)
            {
                return 1;
            }
            else if(this.y == o.y)
            {
                return 0;
            }
            return -1;
        }
        return -1;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString()
    {
        return this.x + " " + this.y;
    }
}