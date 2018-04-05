package auto;

public class AutoDemo
{
    public static void main(String[] args)
    {
        Auto[] arr = new Auto[2];
        arr[0] = new Ford();
        arr[1] = new Chevy();
        
        for(Auto x:arr)
        {
            x.setPrice();
            System.out.println(x);
        }
    }
}
