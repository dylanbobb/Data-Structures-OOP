package tenthousanddaydate;

import java.util.Scanner;
import java.time.LocalDate;

public class TenThousandDayDate
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the month you were born: ");
        int month = keyboard.nextInt();
        System.out.print("Enter the day you were born: ");
        int day = keyboard.nextInt();
        System.out.print("Enter the year you were born: ");
        int year = keyboard.nextInt();
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        System.out.println("You will become 10,000 days old on: " + dateOfBirth.plusDays(10000));
    }
}