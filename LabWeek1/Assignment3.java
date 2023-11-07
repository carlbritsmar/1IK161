package LabWeek1;
import java.util.Scanner;
public class Assignment3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
        int hours = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int sec = seconds % 60;
        {
            System.out.println(seconds + " Seconds is " + hours + " hours and " + min + " minutes and " + sec + " seconds");
        }

    }
}