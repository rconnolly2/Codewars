public class sumprime {
    public static int solve(int [] arr){  
        int total = 0;

        for (int i=0; i<=arr.length-1; i++) {
            if (EsPrimo(i)) {
                total+=arr[i];
            }
        }

        return total;
    }

    public static boolean EsPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        // verifico si es primo iterando desde n-1 hasta 2
        for (int i=n-1; i>=2; i--) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
