public class nextbiggern {
    public static long nextBiggerNumber(long n) {
        char[] digitos = Long.toString(n).toCharArray();
      
        // Gracias a esta pagina lo he entendido es muy fácil : https://dev.to/kopiro/kata-resolution-next-bigger-number-with-the-same-digits-41mj
        
        // Primero tengo que entrar desde el penúltimo dígito el numero que tenga un numero mas grande a la derecha hasta llegar al primer dígito
        int i = digitos.length-2; // primer indice
        for (;i>=0 && digitos[i]>=digitos[i+1]; i--) {
            ;// no hago nada es como un pass en py
        }

        if (i==-1) {
            return (long) -1; // en caso que no encuentre el primer indice ya sabre que no podre encontrar el siguiente gran num
        }

        // Luego tengo que encontrar desde el ultimo dígito un numero que sea menor al numero de antes pero que sea el mayor hasta el indice del numero
        int j = digitos.length-1; // segundo indice
        for (;digitos[j]<=digitos[i]; j--) { // me encontrara un numero mayor que sea menor al num de antes
            ;// no hago nada es como un pass en py
        }

        // Tercera parte sustituir primer dígito encontrado por el segundo y al revés
        char d1 = digitos[i], d2 = digitos[j];
        digitos[j] = d1; // Les hago un cambiazo
        digitos[i] = d2;
        String str_digitos = new String(digitos);

        // Ahora lo corto desde todos los numero a la derecha del primer indice y la segunda parte lo tengo que invertir
        String str_digitos1 = str_digitos.substring(0, i+1);
        String str_digitos2 = str_digitos.substring(i+1);
        str_digitos2 = reverseUsingStringBuilder(str_digitos2); // invierto
        str_digitos = str_digitos1+str_digitos2; // concateno el resultado

        return Long.parseLong(str_digitos);
    }   

    public static String reverseUsingStringBuilder(String input) {
        if (input == null) {
            return null;
        }
    
        StringBuilder output = new StringBuilder(input).reverse();
        return output.toString();
    }

    public static void main(String[] args) {
        ;
    }
}
