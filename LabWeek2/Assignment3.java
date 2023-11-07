package LabWeek2;
import java.util.Scanner;
public class Assignment3
{

    public static void main(String[] args)
    {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a sentence: ");
            String s = input.nextLine();
            System.out.println("Letter count is: " + countLetters(s));


    }
    public static int countLetters(String s)
    {
        int count;
        {
            count = 0;
            int l = s.length();

            for (int i = 0; i < l; i++)
            {
                if (s.charAt(i) != ' ')
                {
                    count++;
                }

            }
        }
        return count;
    }
}


