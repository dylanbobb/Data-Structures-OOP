package certofdeposit;

import java.util.Scanner;
import java.time.LocalDate;

public class TestCertOfDeposit
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        CertOfDeposit[] certArr = new CertOfDeposit[2];
        for(CertOfDeposit x:certArr)
        {
            System.out.print("Enter Certification Number: ");
            int certNum = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter Last Name           : ");
            String lastName = keyboard.nextLine();
            System.out.print("Enter Balance             : ");
            double balance = keyboard.nextDouble();
            System.out.print("Enter Year Of Issue       : ");
            int year = keyboard.nextInt();
            System.out.print("Enter Month Of Issue      : ");
            int month = keyboard.nextInt();
            System.out.print("Enter Day Of Issue        : ");
            int day = keyboard.nextInt();
            LocalDate issue = LocalDate.of(year, month, day);
            x = new CertOfDeposit(certNum,lastName,balance,issue);
            System.out.println();
            System.out.println("Cert: " + x.getCertNum());
            System.out.println("Last Name: " + x.getLastName());
            System.out.println("Balance  : " + x.getBalance());
            System.out.println("Issue: " + x.getIssue());
            System.out.println("Maturity: " + x.getMaturity());
            System.out.println();
        }
    }
}