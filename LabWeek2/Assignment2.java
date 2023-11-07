package LabWeek2;
import java.util.Scanner;
public class Assignment2
{
 public static String capitalize()
 {
     String sent;
     Scanner input = new Scanner(System.in);
     System.out.print("Write a sentence: ");
     String Sentence = input.nextLine();
     sent = Sentence.toUpperCase();
     return sent;
 }
    public static void main(String[] args)
    {
        System.out.println(capitalize());

    }
}
