public class circulosdenumeros {
    public static int circleOfNumbers(int n, int firstNumber) {
        // calculo la distancia entre cada numero vecino
        int distancia = n / 2;
        
        // calculo la posición opuesta
        int posición_opuesta = (firstNumber + distancia) % n;
        
        return posición_opuesta;
    }

    public static void main(String[] args) {
        ;
    }
}
