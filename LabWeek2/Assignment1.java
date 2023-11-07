package LabWeek2;
import java.util.Scanner;

public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sentence = input.nextLine();

        int l = sentence.length();
        char space;
        {
            for (int i = 0; i < l; i++)
            {
                space = sentence.charAt(i);
                if (space != ' ')
                {
                    System.out.print(space);
                }
                else
                {
                    System.out.println();
                }
            }
        }
    }
}