public class conversorromano {
    public String solution(int n) {

        String resultado = "";

        // 2 arrays ordenados 
        int[] valores = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] símbolos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        // Itero sobre cada valor y hago un append al string (concateno)
        for (int i = 0; i < valores.length; i++) {
            while (n >= valores[i]) {
                resultado += símbolos[i];
                n = n - valores[i]; // voy restando
            }
        }

        return resultado;
    }
}
