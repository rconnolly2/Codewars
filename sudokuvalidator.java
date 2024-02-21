import java.util.ArrayList;
import java.util.Arrays;

public class sudokuvalidator {
    public static boolean validate(int[][] board) {
        if (HorizVert(board)==true && Comp3por3(board)==true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean HorizVert(int[][] board) {
        // horiz
        for (int i=0; i<=board.length-1; i++) {
            ArrayList<Integer> arr_lst = new ArrayList<Integer>();
            for (int j=0; j<=board[0].length-1; j++) {
                if (arr_lst.contains(board[i][j]) || board[i][j]==0) {
                    System.out.println("aqui");
                    return false; // no es valido n repetido
                } else {
                    arr_lst.add(board[i][j]);
                }
            }
        }
        // vert
        for (int i=0; i<=board[0].length-1; i++) {
            ArrayList<Integer> arr_lst = new ArrayList<Integer>();
            for (int j=0; j<=board.length-1; j++) {
                if (arr_lst.contains(board[j][i]) || board[j][i]==0) {

                    return false;
                } else {
                    arr_lst.add(board[j][i]);
                }
            }
        }
        return true;
    }

    public static boolean Comp3por3(int[][] board) {
        for (int i=0; i<=6; i+=3) { // 0, 3, 6
            for (int j=0; j<=6; j+=3) { // 0, 3, 6
                ArrayList<Integer> arr_lst = new ArrayList<Integer>(); // nueva lista cada 3x3
                for (int k=i; k<=i+2; k++) {
                    for (int l=j; l<=j+2; l++) {
                        if (arr_lst.contains(board[k][l])) {
                            System.out.println(k+" "+l);
                            System.out.println(arr_lst);
                            return false;
                        } else {
                            arr_lst.add(board[k][l]);
                        }
                    }
                }
                arr_lst.clear();
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validate(new int[][]{
            {5,3,4,6,7,8,9,1,2},
            {6,7,2,1,9,5,3,4,8},
            {1,9,8,3,4,2,5,6,7},
            {8,5,9,7,6,1,4,2,3},
            {4,2,6,8,5,3,7,9,1},
            {7,1,3,9,2,4,8,5,6},
            {9,6,1,5,3,7,2,8,4},
            {2,8,7,4,1,9,6,3,5},
            {3,4,5,2,8,6,1,7,9}}));
    }
}
