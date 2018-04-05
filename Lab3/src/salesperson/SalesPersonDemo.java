package salesperson;

import java.util.ArrayList;

public class SalesPersonDemo
{
    public static void main(String[] args)
    {
       ArrayList<SalesPerson> salesList = new ArrayList();
       int sales = 500;
       for(int i = 0; i < 3; i++)
       {
           salesList.add(new SalesPerson(i+1,sales));
           sales += 500;
       }
       
       salesList.forEach((x) ->
       {
           System.out.println(x);
       });
    }
}