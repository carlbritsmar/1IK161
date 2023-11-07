package LabWeek2;

public class Assignment4{
    public static void main(String[] args){
        int m = 10;

        for (int i = m-1; i > 0 ; i--)
        {
            for(int j = 1; j <= 10; ++j)
            {
                if (m > j + i){
                    System.out.print(" ");}
                else{
                    System.out.print(" " + j);}
            }
            System.out.print("\n");
        }
        for (int p = 0; p < 10; p++)
        {
            for (int q = 1; q <= 10; q++)
            {
                if (m > p + q)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" " + q );
                }
            }
            System.out.print("\n");
        }
    }

}