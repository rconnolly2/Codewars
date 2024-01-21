public class numprimo {
    public static boolean isPrime(int num) {
        if (num<1 || num==1) { // si es menor que 1 no es primo o también 1
          return false;
        }
        
        int raiz_cuadrada = (int) Math.sqrt(num);
        for (int i=2; i<=raiz_cuadrada; i++) { // itero desde 2 hasta raizcuadrada para que sea mas optimo
          if (num%i==0) { // compruebo si hay que al dividirlo con nuestro numero
            return false; // de resto 0 si es asi es NO ES PRIMO
          }
        }
        
        return true;
      }
    
    public static void main(String[] args) {
        System.out.println(isPrime(41));
    }
    
}
