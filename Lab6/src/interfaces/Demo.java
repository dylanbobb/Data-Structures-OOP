package interfaces;

public class Demo
{
    public static void main(String[] args)
    {
        ITaxable[] arr = new ITaxable[6];
        arr[0] = new TaxableHouse("Montreal",true,500000,10000);
        arr[1] = new TaxableHouse("Toronto",true,600000,20000);
        arr[2] = new TaxableHouse("Vancouver",true,700000,30000);
        arr[3] = new TaxableBus(0,10,80000,20);
        arr[4] = new TaxableBus(1,20,80000,30);
        arr[5] = new TaxableBus(2,30,80000,40);
        
        for(ITaxable x:arr)
        {
            System.out.println(x);
            System.out.println();
        }
    }
}