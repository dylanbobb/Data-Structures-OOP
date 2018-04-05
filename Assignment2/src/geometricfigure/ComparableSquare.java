package geometricfigure;

// This class will model a square that can be compared to another comparable square by its area.
// Since a square is a geometric figure we should inherit that class.
// Since we need a way to compare 2 comparable squares, we will impliment the Comparable interface.
public class ComparableSquare extends Square implements Comparable<ComparableSquare>
{
    // Override the interface's compareTo() method to compare two comparable squares based on their area.
    @Override
    public int compareTo(ComparableSquare other)
    {
        // Return 1 if the calling object's area is bigger than other's area.
        if(this.area > other.area)
        {
            return 1;
        }
        // Return -1 is if the calling object's area is smaller than the other's area.
        if(this.area < other.area)
        {
            return -1;
        }
        // Otherwise, the two areas are equal and we return 0.
        return 0;
    }
    
    // Constructors that will call squares constructors.
    // The same logic will be used as in the Square class to make sure the height and width are the same. (See comments on Square method).
    public ComparableSquare(double height, double width)
    {
        super(height,height);
    }
    
    public ComparableSquare(double height)
    {
        super(height,height);
    }
}