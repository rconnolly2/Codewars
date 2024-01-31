import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class whowonconnect {
    public static String whoIsWinner(List<String> piecesPositionList) {
        char[][] tabla = new char[6][7];
        char[] lista_pos_col = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (String i : piecesPositionList) {
            String[] partes = i.split("_");
            char color = partes[1].charAt(0);
            int columna = SacarIndiceColumna(partes[0].charAt(0), lista_pos_col); // saco posición utilizando lista como referencia

            int fila = PiezaCae(tabla, columna, color); // hago que la pieza caiga
            if (AlguienGana(tabla, fila, columna, color)) { // Si en la iteración el color es el rojo devuelvo rojo
                return color == 'R' ? "Red" : "Yellow";
            }
        }

        return "Draw";
    }

    public static int SacarIndiceColumna(char letra, char[] lista_col) {
            for (int i=0; i<=lista_col.length-1; i++) {
                if (lista_col[i] == letra) {
                    return i;
                }
            }
        return -1; // no lo encuentra (no va a pasar)
    }

    public static int PiezaCae(char[][] tabla, int columna, char color) {
        for (int i=5; i>=0; i--) {
            if (tabla[i][columna] == 0) {
                tabla[i][columna] = color;
                return i; // devuelvo fila
            }
        }
        return -1; // columna llena
    }

    public static boolean AlguienGana(char[][] tabla, int fila, int colum, char color) {
        return ComprobarHorizontal(tabla, fila, colum, color) || ComprobarVertical(tabla, fila, colum, color) || ComprobarDiagonal(tabla, fila, colum, color);
    }

    public static boolean ComprobarHorizontal(char[][] tabla, int fila, int col, char color) {
        int contador = 0;
    
        for (int i=col-3; i<=col+3; i++) {
            if (i >= 0 && i < 7 && tabla[fila][i] == color) {
                contador++;
            } else {
                contador = 0;
            }
    
            if (contador == 4) {
                return true;
            }
        }
    
        return false;
    }
    
    public static boolean ComprobarVertical(char[][] tabla, int fila, int col, char color) {
        int contador = 0;
    
        for (int i=fila-3; i<=fila+3; i++) {
            if (i >= 0 && i < 6 && tabla[i][col] == color) {
                contador++;
            } else {
                contador = 0;
            }
    
            if (contador == 4) {
                return true;
            }
        }
    
        return false;
    }
    
    public static boolean ComprobarDiagonal(char[][] tabla, int fila, int col, char color) {
        int contador = 0;
    
        for (int i=-3; i<=3; i++) {
            int f = fila + i;
            int c = col + i;
    
            if (f >= 0 && f < 6 && c >= 0 && c < 7 && tabla[f][c] == color) {
                contador++;
            } else {
                contador = 0;
            }
    
            if (contador == 4) {
                return true;
            }
        }
    
        contador = 0; // reseteo contador
    
        for (int i=-3; i<=3; i++) {
            int f = fila - i;
            int c = col + i;
    
            if (f >= 0 && f < 6 && c >= 0 && c < 7 && tabla[f][c] == color) {
                contador++;
            } else {
                contador = 0;
            }
    
            if (contador == 4) {
                return true;
            }
        }
    
        return false;
    }

    public static void main(String[] args) {
        System.out.println(whoIsWinner(new ArrayList<String>(Arrays.asList(
            "A_Yellow",
            "B_Red",
            "B_Yellow",
            "C_Red",
            "G_Yellow",
            "C_Red",
            "C_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "G_Yellow",
            "D_Red",
            "F_Yellow",
            "E_Red",
            "D_Yellow"
        ))));
    }
}
