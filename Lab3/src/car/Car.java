package car;

public class Car
{
    private int year;
    private Model model;
    private Color color;
    
    public Car(int yr, Model m, Color c)
    {
        this.year = yr;
        this.model = m;
        this.color = c;
    }
    
    public void display()
    {
        System.out.println("Car is a " + year + " " + color + " " + model);
        
    }
}