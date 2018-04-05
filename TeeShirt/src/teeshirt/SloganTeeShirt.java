package teeshirt;

public class SloganTeeShirt extends TeeShirt
{
    private String slogan;
    
    public SloganTeeShirt()
    {
        super("M");
        slogan = "Any slogan";
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("slogan is " + slogan);
    }
}