package salesperson;

public class DemoSalesperson2
{
    public static void main(String[] args)
    {
        Salesperson[] salesArray = new Salesperson[5];
        int idNumber = 111;
        double annualSales = 25000;
        for(Salesperson x:salesArray)
        {
            x = new Salesperson(idNumber, annualSales);
            System.out.println(x);
            idNumber++;
            annualSales += 5000;
        }
    }
}