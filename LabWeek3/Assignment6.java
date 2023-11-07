package LabWeek3;

// Ants on a Chessboard.
public class Assignment6 {
    public static void main(String[] args) {
            int count = 0;
        for (int i = 0; i < 10; i++) {
            //create board 8x8
            int[][] grid = new int[8][8];
            //spawn on random place
            int x = (int) (Math.random() * 8);
            int y = (int) (Math.random() * 8);

            count++;
            int targetSteps = 8 * 8;
            int totalSteps = 0;
            int coveredCells = 0;

            do {
                // which way ant will walk
                int random = (int) (Math.random() * 4 + 1);
                if (random == 1) {
                    x--; // move left
                    totalSteps++;
                    //Reset ant if walks off grid
                    if (x < 0) {
                        x++;
                        totalSteps--;
                    }
                } else if (random == 2) {
                    x++; // move right
                    totalSteps++;
                    if (x > 7) {
                        x--;
                        totalSteps--;
                    }
                } else if (random == 3) {
                    y--;
                    totalSteps++;
                    // move up
                    if (y < 0) {
                        y++;
                        totalSteps--;
                    }
                } else if (random == 4) {
                    y++; // move down
                    totalSteps++;
                    if (y > 7) {
                        y--;
                        totalSteps--;
                    }
                }
                //know where ant has walked
                if (grid[x][y] == 0) {
                    (grid[x][y]) = 1;
                    coveredCells++;
                }
            } while (coveredCells != targetSteps);
            System.out.println("Antal steg varv " + count + "; " + totalSteps);
        }
    }
}