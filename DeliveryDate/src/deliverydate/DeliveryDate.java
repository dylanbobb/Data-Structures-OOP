package deliverydate;

import java.util.Scanner;
import java.time.LocalDate;

public class DeliveryDate
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        LocalDate orderDate;
        int mo;
        int day;
        int year;
        final int WEEKS_FOR_DELIVERY = 2;

        System.out.print("Enter order month ");
        mo = input.nextInt();
        System.out.print("Enter order day ");
        day = input.nextInt();
        System.out.print("Enter order year ");
        year = input.nextInt();
        orderDate = LocalDate.of(year, mo, day);
        System.out.println("Order date is " + orderDate);
        System.out.println("Deliver date is " + orderDate.plusWeeks(WEEKS_FOR_DELIVERY));
    }
    
}