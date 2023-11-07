package secondChance;
import java.util.Scanner;
public class Assignment4 {

    public static void main(String[] args) {
        //Scanner to be able to store input in array.
        int [] a = new int [4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 Integers: ");
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        // new array
        int[][] b = new int[4][4];
        //columns
        for (int j=0; j < 4; j++) {
            //rows
            for (int i = 0; i < 4; i++) {
                b[j][i] = a[i];
            }
        }
        //method in main
        shiftArray(b);
    }
    // to keep array within bounds
    static int n = 4;
    public static void shiftArray(int [][]b)
    {
        // k amount of moves per row
        int k = 0;
        //rows printed
        int j = 0;
        while (j < n) {

            // Print elements from index k
            for (int i = k; i < n; i++)
                System.out.print(b[j][i] + " ");

            // Print elements before index k
            for (int i = 0; i < k; i++)
                System.out.print(b[j][i] + " ");
            System.out.println();
            j++;
            k++;
        }
    }
}