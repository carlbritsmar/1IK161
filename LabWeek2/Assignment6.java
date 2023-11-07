package LabWeek2;

import java.util.Scanner;

public class Assignment6
{
    public static void readSalary()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your gross income: ");
        float grossIncome = input.nextFloat();
        netSalary(grossIncome);
    }

    public static void netSalary(float grossIncome)
    {

    float netIncome1, netIncome2,  netIncome3,  netIncome4;
        float taxBracket1 = 0.20f;
        float taxBracket2 = 0.3212f;
        float taxBracket3 = 0.5235f;
        float taxBracket4 = 0.5748f;
        float churchTax = grossIncome * 0.0022f;

        float salary = grossIncome - churchTax;

        if (salary <= 200)
        {
            netIncome1 = salary * taxBracket1;
            float netYearlyIncome1 = salary - (netIncome1);
            System.out.println("tax is " + (netIncome1)+ " tkr");
            System.out.println("The church tax is " + churchTax + "tkr" );
            System.out.println("Net yearly income is " + netYearlyIncome1 + " tkr");
        }
        else if (salary <= 468)
        {
            netIncome2 = (salary - 268 )* taxBracket2;
            float netYearlyIncome2 = salary - (40 + netIncome2);
            System.out.println("tax is " + (40 + netIncome2) + " tkr");
            System.out.println("the church tax is: " + churchTax + " tkr ");
            System.out.println("Net yearly income is: " + netYearlyIncome2 + " tkr ");
        }
        else if (salary <= 675)
        {

            netIncome3 = (salary - 468) * taxBracket3;
            float netYearlyIncome3 = salary - (40+86+netIncome3);
            System.out.println("tax is " + (40+86+netIncome3)+"tkr");
            System.out.println("the church tax is " + churchTax + " tkr ");
            System.out.println("Net yearly income is: " + netYearlyIncome3 + "tkr");
        }
        else if (salary >= 675)
        {
            netIncome4 = (salary - 675) * taxBracket4;
            float YearlyIncome = salary - (40+86+108+netIncome4);
            System.out.println("tax is " + (40+86+108+netIncome4) + " tkr");
            System.out.println("the church tax is: " + churchTax + " tkr ");
            System.out.println("Net yearly income is: " + YearlyIncome + " tkr ");

        }


    }

    public static void main(String[] args)
    {
        readSalary();

    }
}
