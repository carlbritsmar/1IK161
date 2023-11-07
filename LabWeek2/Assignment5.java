package LabWeek2;
import java.util.Scanner;
public class Assignment5
{
    public static void checkSSN()
    {
        String str1 = "Continue";
        String choice;
        do
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a personal number: ");
            String SSN = input.nextLine();
            System.out.println(SSN);

                    boolean isValid = (SSN.length() == 13) && (SSN.charAt(8) == '-') && Character.isDigit(SSN.charAt(0)) &&
                    Character.isDigit(SSN.charAt(1)) && Character.isDigit(SSN.charAt(2)) &&
                    Character.isDigit(SSN.charAt(3)) && Character.isDigit(SSN.charAt(4)) &&
                    Character.isDigit(SSN.charAt(5)) && Character.isDigit(SSN.charAt(6)) &&
                    Character.isDigit(SSN.charAt(7)) &&
                    Character.isDigit(SSN.charAt(9)) && Character.isDigit(SSN.charAt(10)) &&
                    Character.isDigit(SSN.charAt(11)) && Character.isDigit(SSN.charAt(12));
            if (isValid)
            {
                System.out.println("That is an valid SSN");
            }
            else
            {
                System.out.println("That is not a valid SSN");
                return;
            }

            System.out.println("type \"Continue\" or \"Exit\" ");
            Scanner prompt = new Scanner(System.in);
            System.out.print("Choice: ");
            choice = prompt.nextLine();
        } while (choice.equalsIgnoreCase(str1));
    }
    public static void main(String[] args)
    {
        checkSSN();
    }
}