public class sumnum {
    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } 
    
        int resultado = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            resultado += i;
        }
    
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(-2, -1));
    }
}
