public class breakcamelcase {
    public static String camelCase(String input) {
        String r = "";
        if (input.length()>1) { // Si el string no esta vacio compruebo
            r += input.charAt(0); // añado el primer caracter a mi resultado
            for (int i=1; i<=input.length()-1; i++) { // itero sobre el str input
                char caracter = input.charAt(i); 
                if (Character.isUpperCase(caracter) && input.charAt(i-1) != ' ') {
                    r += ' '; // Si el caratcer actual es mayus y el anterior no es un espacio
                              // meto un espacio
                }

                r += input.charAt(i); // añado el caracter que manejo
            }
        }
        return r;
    }
    public static void main(String[] args) {
        System.out.println(camelCase(""));
    }
}
