package salesperson;

public class DemoSalesperson
{
    public static void main(String[] args)
    {
        Salesperson[] salesArray = new Salesperson[5];
        for(Salesperson x:salesArray)
        {
            x = new Salesperson(9999, 0);
            System.out.println(x);
        }
    }
}