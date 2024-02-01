import org.w3c.dom.ranges.RangeException;

public class factorial {
    public static int factorial(int n) {
        if (n<0 || n>12) {
            throw new IllegalArgumentException();
        }
        
        if (n==0) { // caso base
            return 1;
        }

        return n*factorial(n-1); //https://en.wikipedia.org/wiki/Factorial
      }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
