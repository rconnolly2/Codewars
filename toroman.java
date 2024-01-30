public class toroman {
    public static String toRoman(int n) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] valores_romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();
        

        while (true) {
            if (n==0) {
                break;
            }

            for (int i=0; i<=valores.length-1; i++) { // itero sobre las dos listas
                if (valores[i] <= n) { // si valor de lista es menor al num
                    resultado.append(valores_romanos[i]); // los añado a la lista
                    n=n-valores[i];
                    break; // salgo de bucle for
                }
            }

        }
    
        return resultado.toString();
      }
    
    public static int fromRoman(String romanNumeral) {
        int resultado = 0;
    
        for (int i=0; i<=romanNumeral.length()-1; i++) { // itero sobre el string (como un array)
          int valor_actual_char = DameValor(romanNumeral.charAt(i));
          int valor_siguiente_char = 0;

          if (!(i+1 >= romanNumeral.length())) { // si no me paso cojo el siguiente valor
                valor_siguiente_char=DameValor(romanNumeral.charAt(i+1));
          }
    
          if (valor_actual_char >= valor_siguiente_char) { // si el valor del primer char es mayor al segundo
            resultado += valor_actual_char; // se lee normal
          } else { // sino tengo que restar al leerlo
            resultado += (valor_siguiente_char - valor_actual_char);
            i++;
          }
        }
    
        return resultado;
    }
    
    public static int DameValor(char str_romano) {
        switch (str_romano) {
          case 'I':
            return 1;
          case 'V':
            return 5;
          case 'X':
            return 10;
          case 'L':
            return 50;
          case 'C':
            return 100;
          case 'D':
            return 500;
          case 'M':
            return 1000;
          default:
            return -1; // error
        }
    }
    
}
