package LabWeek1;
import java.util.Scanner;
public class Assignment5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        {
            System.out.print("Enter five integers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int f = input.nextInt();

            if (a == b || b == c || d == f || f == a || f == b || f == c || c == a || c == d || a == d || d == b)
            {
                System.out.println("Duplicates");
            }
            else
            {
                System.out.println("All integers are unique");
            }
        }
    }
}
