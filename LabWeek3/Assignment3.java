package LabWeek3;
import java.util.Scanner;
public class Assignment3
{
    public static void main(String[] args)
    {

        //prompt user for 10 integers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 random Integer numbers: ");
        // declare array with 10 values
        int [] array = new int[10];
        //declare variable n and set it to length of array
        int n = array.length;
        //store input from scanner in array
        for (int i = 0; i < n ; i++)
        {
            array[i] = sc.nextInt();
        }
        // run subarray method in main
        subarray(array, n);
    }
    //method for checking subarrays
    public static void subarray(int [] array, int n)
    {
        //
        System.out.println("increasing subarrays are: ");
        for (int i = 0; i < n ; i++)
        {
            // Condition to check whether the element at i, is
            // greater than its next neighbouring element or not.
            if (i + 1 < n && array[i] < array[i + 1])
            {
                System.out.print(array[i] + " ");
            }
            else
                System.out.print(array[i] + "\n");
        }
    }
}