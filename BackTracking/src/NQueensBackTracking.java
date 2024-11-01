public class NQueensBackTracking {

    public static void main(String[] args){
        int N = 4;
        int[][] board = new int[N][N];

        NQueens(board, N);
    }

    public static boolean NQueens(int[][] chessboard, int queens){
        // TO DO
        if(queens == 0){
            print(chessboard); //base case
            return true;
        }
        else{
            int currentRow = chessboard.length - queens;
            for(int i = 0; i < chessboard.length; i++){
                if(isSafe(chessboard,currentRow,i)){
                    // make a choice
                    chessboard[currentRow][i] = 1;
                    //visualize(chessboard);
                    //explore
                    boolean result = NQueens(chessboard, queens - 1);
                    if(result) return true;
                    //unmake a choice
                    chessboard[currentRow][i] = 0;
                    //visualize(chessboard);
                }

            }

        }
        return false;
    }

    public static boolean isSafe(int[][] chessboard, int row, int col){
        int N = chessboard.length;
        //check row
        for (int i = 0; i < N; i++){
            if(chessboard[row][i] == 1)
                return false;
        }

        //check column
        for(int i = 0; i < N; i++)
        {
            if(chessboard[i][col] == 1)
                return false;
        }

        //check upper left diagonal
        int r = row;
        for(int c=col; c >= 0 && r >= 0; c--, r--) {
            if(chessboard[r][c] == 1) {
                return false;
            }
        }

        //check upper right diagonal
        r = row;
        for(int c=col; c < N && r >= 0; r--, c++) {
            if(chessboard[r][c] == 1) {
                return false;
            }
        }

        //check lower left diagonal
        r = row;
        for(int c=col; c>=0 && r < N; r++, c--) {
            if(chessboard[r][c] == 1) {
                return false;
            }
        }

        //check lower right diagonal
        for(int c=col; c < N && r < N; c++, r++) {
            if(chessboard[r][c] == 1) {
                return false;
            }
        }

        return true;
    }


    public static void print(int[][] chessboard){
        for(int i = 0; i < chessboard.length; i++)
            System.out.print("--");
        System.out.println();
        for(int[] row: chessboard){
            for(int i = 0; i <  chessboard.length; i ++){
                System.out.print(row[i] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public static void printWithCarriageReturn(int[][] chessboard){
        System.out.print("\033[H\033[2J"); // Clear the console using ANSI escape codes
        System.out.flush();
        for(int i = 0; i < chessboard.length; i++)
            System.out.print("--");
        System.out.println();
        for(int[] row: chessboard){
            for(int i = 0; i <  chessboard.length; i ++){
                System.out.print(row[i] == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    private static void clearConsole() {
        System.out.print("\033[H\033[2J"); // ANSI escape code to clear the console
        System.out.flush();
    }

    private static void addDelay() {
        try {
            Thread.sleep(2500); // Delay of 500 milliseconds (adjust as needed)
        } catch (InterruptedException e) {
            // Handle the exception
            e.printStackTrace();
        }
    }

    private static void visualize(int[][] chessboard){
        clearConsole();
        printWithCarriageReturn(chessboard);
        addDelay();
    }
}
