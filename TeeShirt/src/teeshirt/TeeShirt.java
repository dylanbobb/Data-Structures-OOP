package teeshirt;

public class TeeShirt
{
    private String size;
    private String color;
    
    public TeeShirt(String s)
    {
        size = s;
        color = "White";
    }
    
    public void display()
    {
        System.out.println("size is " + size + " and color is " + color);
    }
}