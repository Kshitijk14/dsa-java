package Jan21;

public class nQueens {
    
    public static void main(String[] args) {
        int [][] chess = new int [4][4];
        placeQueens(chess, "", 0);
        System.out.println("Total Count:" + count);
    }

    static int count = 0;

    public static void placeQueens(int[][] chess, String qsf, int row) {
        // base case
        if( row == chess.length) {
            System.out.println(qsf);
            return;
        }

        for (int col=0; col < chess.length; col++) {

            if (isSpotSafe(chess, row, col)) {
                chess[row][col] = 1; // placing the queen
                count++;
                placeQueens(chess, qsf+row+ "-" +col+ ",", row+1);
                chess[row][col] = 0; // removing the queen
            }

        }
    }

    public static boolean isSpotSafe (int[][] chess, int row, int col) {
        // vertical down
        for (int i=row-1, j=col; i>=0; i--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // left diagonal
        for (int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        // right diagonal
        for (int i=row-1, j=col+1; i>=0 && j<chess.length; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }

        return true;
    }
}
