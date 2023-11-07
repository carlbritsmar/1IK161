package LabWeek3;
import java.util.Scanner;
public class Assignment1
{
    public static void main(String[] args)
    {
        //declare three variables which will store the count
        int age18 = 0;
        int age18plus = 0;
        int age65plus = 0;
        //prompt user to enter the age of 10 people
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the age of 10 different people: ");
        // Declare array
        int [] array = new int[10];
        //for loop which checks
        for (int i = 0; i < array.length; i++)
        {
            // store user input in array
            array [i] = input.nextInt();
                // if value in i array is less increment correlating Int.
                if (array [i] < 18)
                {
                    age18++;
                }
                else if (array [i] > 18 && array[i] < 65)
                {
                    age18plus++;
                }
                else if (array [i] > 65)
                {
                    age65plus++;
                }
        }
        // print the results
        System.out.println("<18: " + age18);
        System.out.println("18 - 65: " +age18plus);
        System.out.println("+65: " +age65plus);

    }
}
// 12 45 56 67 45 23 97 5 29 56