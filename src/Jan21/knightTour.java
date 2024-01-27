package Jan21;

public class knightTour {
    
    public static void main(String[] args) {
        int[][] chess = new int[5][5];

        knightTours(chess, 0, 0, 1);
    }

    public static void knightTours (int[][] chess, int row, int col, int move) {

        // base case
        if (row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col] > 0) {
            return;
        } else if (move == chess.length * chess.length) { // move = 25
            chess[row][col] = move;
            displayBoard(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = move; // place
        
        knightTours(chess, row-2, col+1, move+1);
        knightTours(chess, row-1, col+2, move+1);
        knightTours(chess, row+1, col+2, move+1);
        knightTours(chess, row+2, col+1, move+1);
        knightTours(chess, row+2, col-1, move+1);
        knightTours(chess, row+1, col-2, move+1);
        knightTours(chess, row-1, col-2, move+1);
        knightTours(chess, row-2, col-1, move+1);

        chess[row][col-1] = 0; // remove
    }

    public static void displayBoard(int[][] chess) {
        System.out.println("Printing Board........");

        for (int i=0; i<chess.length; i++) {
            for (int j=0; j<chess[i].length; j++) {
                System.out.println(chess[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("-----------------------------------------------------------");
    }
}
