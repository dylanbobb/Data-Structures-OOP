package geometricfigure;

// This class will model a Rectangle.
// A rectangle is a geometric figure so we should inherit that class.
public class Rectangle extends GeometricFigure
{
    // The area for a rectangle is calculated by multiplying the height and width.
    @Override
    public void computeArea()
    {
        this.area = this.height * this.width;
    }
    
    // Constructor that will call the constructor of geometric figure(2 arguments: height and width).
    public Rectangle(double height,double width)
    {
        super(height,width);
    }
}