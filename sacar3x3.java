import java.util.HashMap;

public class sacar3x3 {

    public static boolean validate(int[][] board) {
        for (int i=0; i<=6; i+=3) { // itero desde 0, 3, 6
            for (int j=0; j<=6; j+=3) {
                System.out.println(board[i][j]);
                HashMap<Integer, Integer> dic_contador = new HashMap<Integer, Integer>();
                for (int k=i; k<=i+2; k++) { // columnas
                    for (int l=j; l<=j+2; l++) { // ademas i hasta i+3
                        //System.out.print(board[k][l]);
                        if (l==j+2) {
                            System.out.println("");
                        }
                        if (!(dic_contador.containsKey(board[k][l]))) { // Si no contiene este numero
                            dic_contador.put(board[k][l], 1); // inicio contador a 1
                        } else {
                            System.out.println(dic_contador);
                            System.out.println(k+" "+l);
                            return false; // numero ya existe en nuestro diccionario
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validate(new int[][]{
            {1,3,2,5,7,9,4,6,8},
            {4,9,8,2,6,1,3,7,5},
            {7,5,6,3,8,4,1,2,9},
            {6,4,3,1,5,8,7,9,2},
            {5,2,1,7,9,3,8,4,6},
            {9,8,7,4,2,6,5,3,1},
            {2,1,4,9,3,5,6,8,7},
            {3,6,5,8,1,7,9,2,4},
            {8,7,9,6,4,2,1,5,3}}));
    }
}