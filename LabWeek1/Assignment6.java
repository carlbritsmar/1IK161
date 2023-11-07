package LabWeek1;
import java.util.Scanner;
public class Assignment6
{
    public static void main(String[] args)
    {
        double sek = 10.62;
        double nok = 10.01;
        double dkk = 7.44;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in euro: ");

        double euro = input.nextDouble();
        Scanner currency = new Scanner(System.in);
        System.out.println("Select the currency you want to convert ");
        System.out.println(" 1 for Euro to SEK");
        System.out.println(" 2 for Euro to NOK");
        System.out.println(" 3 for Euro to DKK");
        System.out.print("Choice: ");
        int pick = currency.nextInt();

        switch (pick)
        {
            case 1:
                double sekEuro = sek * euro;
                System.out.println(euro + " euro converted in to SEK is " + sekEuro + " SEK");
                break;
            case 2:
                double nokEuro = nok * euro;
                System.out.println(euro + " euro converted in to NOK is " + nokEuro+ " NOK");
                break;

            case 3:
                double dkkEuro = dkk * euro;
                System.out.println(euro + " euro converted in to DKK is " + dkkEuro+ " DKK");
                break;
        }
    }
}
