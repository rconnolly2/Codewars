public class dontgivemefive {
      public static int dontGiveMeFive(int start, int end) {
        int contador = 0;
        
        for (int i=start; i<=end; i++) { // itero desde el principio hasta el final
            if (String.valueOf(i).contains("5")) { // si es 5 salto el ciclo
                continue;
            }
            contador++; // aumento contador
        }
        
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }
}
