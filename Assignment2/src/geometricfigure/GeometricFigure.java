package geometricfigure;


// This class will model geometric figures
public abstract class GeometricFigure
{
    // Attributes
    // Protected because this class will act as a parent.
    protected double height;
    protected double width;
    protected double area;
    
    // Accessors/Getters
    public double getHeight()
    {
        return this.height;
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    public double getArea()
    {
        return this.width;
    }
    
    // Constructor with 2 arguments (height and width)
    public GeometricFigure(double height,double width)
    {
        this.height = height;
        this.width = width;
    }
    
    // Method to compute the area.
    // Abstract because each geometric figure has a different formula for area.
    public abstract void computeArea();
    
    // Method to print/display geometric figures.
    public void displayOne()
    {
        System.out.println("Height : " + this.height + " Width : " + this.width + " Area : " + this.area);
        System.out.println(); // Empty Line.
    }
}