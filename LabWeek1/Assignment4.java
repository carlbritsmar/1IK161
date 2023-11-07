package LabWeek1;
import java.util.Scanner;

public class Assignment4
{
    public static void main(String[] args)
    {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number > 0)
        {
           number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
            number = number / 10;
            count++;
        }
        if (number > 0)
        {
        number = number / 10;
        count++;
        }

        System.out.println("the integer count is " +count);
    }
}