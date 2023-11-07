package LabWeek3;
import java.util.Arrays;

public class Assignment5{
        static int[][] rotate(int[][] mat) {
            // Amount of rows 4
             int M = mat.length;
             // amount of columns 3
             int N = mat[0].length;

            int[][] flipped = new int[N][M];
            //for loops that rotates matrix
            for (int row = 0; row < M; row++) {
                 for (int c = 0; c < N; c++) {
                    flipped[c][M-1-row] = mat[row][c];
                }
            }
            //return array when flipped
            return flipped;
        }
        static void printMatrix(int[][] mat) {
            System.out.println("Matrix = ");
            for (int[] row : mat) {
                System.out.println(Arrays.toString(row));
            }
        }
        public static void main(String[] args){
            int[][] A = {
                    {10, 11, 9 ,14},
                    {21, 55, 44, 79},
                    {31, 32, 33, 34}
            };
            printMatrix(A);

            int[][] B = rotate(A);
            printMatrix(B);

        }
}


