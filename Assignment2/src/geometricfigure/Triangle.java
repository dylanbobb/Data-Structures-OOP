package geometricfigure;

// This class will model a triangle.
// Triangles are geometric figures so we should inherit that class.
public class Triangle extends GeometricFigure
{
    // The area for the triangle is determined by multiplying the width by half the height.
    @Override
    public void computeArea()
    {
        this.area = this.width * (this.height / 2);
    }
    
    // 2 argument constructor that will call the parents constructor.
    public Triangle(double height,double width)
    {
        super(height,width);
    }
}