package LabWeek3;
import java.util.Scanner;

public class Assignment2
{
    public static void main(String[] args) {
        //declare two arrays. One for course code and one for correlating course name.
        String [] kurskod = {"1IK171", "1IK172", "1IK071", "1IK161" ,"1IK072"};
        String [] kursnamn = {"Databaser", "Introduktion till data analytics","Grundläggande Informatik", "Grundläggande programmering", "Organisatoriska system"};
        //Prompt user to enter a course code
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Classcode: ");
        String answer = input.nextLine();
            // if user input matches to the first element in first array. print first element in second array.
            if (kurskod[0].equalsIgnoreCase(answer)) {
                System.out.print("The course is " + kursnamn[0]);
            }
            else if (kurskod[1].equalsIgnoreCase(answer)) {
                System.out.print("The course is " + kursnamn[1]);
            }
            else if (kurskod[2].equalsIgnoreCase(answer)) {
                System.out.print("The course is " + kursnamn[2]);
            }
            else if (kurskod[3].equalsIgnoreCase(answer)) {
                System.out.print("The course is " + kursnamn[3]);
            }
            else if (kurskod[4].equalsIgnoreCase(answer)) {
                System.out.print("The course is " + kursnamn[4]);
            }
            // if user input does not equal element in first array sout could not be found
            else {
                System.out.print("The course could not be found");
            }
        }
 }




// Lagra 5 kurskoder och kursnamn i två olika String-arrayer och skriv sedan ett javaprogram som uppmanar användaren att ange en kurskod. Om kurskoden hittas ska programmet visa korrekt kursnamn, annars kommer meddelandet "Kursen hittades inte" att visas.
//Inmatning: Ange en kurskod: 1ik161
//Utdata: Kursen är Grundläggande om programmering
//Inmatning: Ange en kurskod: 1ik429 Utdata: Kursen hittades inte