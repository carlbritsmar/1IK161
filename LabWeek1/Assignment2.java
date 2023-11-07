package LabWeek1;
public class Assignment2
{
    public static void main(String[]args)
    {
        int max = 0;
        int min = 0;

        int number0 = (int)(Math.random() * 899) + 100;
        System.out.println(number0);

        int number1 = (int)(Math.random() * 899) + 100;
        System.out.println(number1);

        int number2 = (int)(Math.random() * 899) + 100;
        System.out.println(number2);

        int number3 = (int)(Math.random() * 899) + 100;
        System.out.println(number3);

        int number4 = (int)(Math.random() * 899) + 100;
        System.out.println(number4);

        int number5 = (int)(Math.random() * 899) + 100;
        System.out.println(number5);
        {

            if (number0 > number1 && number0 > number2 && number0 > number3 && number0 > number4 && number0 > number5)
            {
                System.out.println("The biggest number is " + number0);
                max = number0;
            }
            else if (number1 > number0 && number1 > number2 && number1 > number3 && number1 > number4 && number1 > number5)
            {
                System.out.println("The biggest number is " + number1);
                max = number1;
            }
            else if (number2 > number0 && number2 > number1 && number2 > number3 && number2 > number4 && number2 > number5)
            {
                System.out.println("The biggest number is " + number2);
                max = number2;
            }
            else if (number3 > number0 && number3 > number1 && number3 > number2 && number3 > number4 && number3 > number5)
            {
                System.out.println("The biggest number is " + number3);
                max = number3;
            }
            else if (number4 > number0 && number4 > number1 && number4 > number2 && number4 > number3 && number4 > number5)
            {
                System.out.println("The biggest number is " + number4);
                max = number4;
            }
            else if(number5 > number0 && number5 > number1 && number5 > number2 && number5 > number3 && number5 > number4)
            {
                System.out.println("The biggest number is " + number5);
                max = number5;
            }

            if (number0 < number1 && number0 < number2 && number0 < number3 && number0 < number4 && number0 < number5)
            {
                System.out.println("The smallest number is " + number0);
                min = number0;
            }
            else if (number1 < number0 && number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5)
            {
                System.out.println("The smallest number is " + number1);
                min = number1;
            }
            else if (number2 < number0 && number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5)
            {
                System.out.println("The smallest number is " + number2);
                min = number2;
            }
            else if (number3 < number0 && number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5)
            {
                System.out.println("The smallest number is " + number3);
                min = number3;
            }
            else if (number4 < number0 && number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5)
            {
                System.out.println("The smallest number is " + number4);
                min = number4;
            }
            else if(number5 < number0 && number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4)
            {
                System.out.println("The smallest number is " + number5);
                min = number5;
            }

            int max1 = max / 10;
            max1 = max1 % 10;
            int min1 = min / 10;
            min1 = min1 % 10;

            System.out.print("the sum of the smallest and biggest numbers is " + (max1 + min1));
        }
    }
}
