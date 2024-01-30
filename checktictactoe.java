public class checktictactoe {
    public static int isSolved(int[][] board) {
        for (int j=1; j<=2; j++) {
            for (int i=0; i<=board.length-1; i++) {
                if (board[i][0] == j && board[i][1] == j && board[i][2] == j) {
                    return j;
                }

                if (board[0][i] == j && board[1][i] == j && board[2][i] == j) {
                    return j;
                }
            }

            if ((board[0][0]==j && board[1][1]==j && board[2][2]==j) || (board[0][2]==j && board[1][1]==j && board[2][0]==j)) {
                return j;
            }

        }

        for (int i=0; i<=board.length-1; i++) {
            for (int j=0; j<=board.length-1; j++) {
                if (board[i][j] == 0) {
                    return -1;
                }
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isSolved(new int[][] {
            {1, 1, 1},
            {0, 2, 2},
            {0, 0, 0}
        }));
    }
}
