public class countdiv {
    public static long divisibleCount(long x, long y, long k) {
        // puedo sacar los numeros divisibles cantidad/k https://www.youtube.com/watch?v=27TIT9b-ioQ
  
        long contador = (y/k) - (x/k); // diferencia entre numeros divisibles de x  y
  
        // si el propio n x es divisible por k lo añado al contador
        if (x%k == 0) {
          contador++;
        }
  
        return contador;
      }

    public static void main(String[] args) {
        System.out.println(divisibleCount(11, 345, 17));
    }
}
