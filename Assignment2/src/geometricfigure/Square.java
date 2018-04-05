package geometricfigure;

// This class will model a Square.
// All squares are rectangles so we should inherit that class.
public class Square extends Rectangle
{
    // 2 argument constructor.
    public Square(double height,double width)
    {
        // The height and width must be the same for a square.
        super(height,height);
    }
    
    // 1 Argument constuctor.
    // This can be done because for a square, the height and width must be the same.
    public Square(double height)
    {
        super(height,height);
    }
    
    // The square uses the rectangle's computeArea() method, therefore it is not needed again here.
}