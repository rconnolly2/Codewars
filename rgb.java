import java.util.HashMap;
import java.util.Map;

public class rgb {
        public static HashMap<String, Integer> hexStringToRGB(String hex) {
        HashMap<String, Integer> diccionario_rgb = new HashMap<>();
        String[] lista_colores = new String[] {"r", "g", "b"};
        int valordec = 0;
        int indice_color = 0;
        hex = hex.replace("#", ""); // elimino #
        
        int contador = 0;
        for (int i=0; i<=hex.length()-1; i++) {
            contador++;

            if (contador==2) {
                String str_color = hex.substring(i-1, i+1);
                valordec = Integer.parseInt(str_color, 16); // lo convierto str base 16 a int base 10
                diccionario_rgb.put(lista_colores[indice_color], valordec);

                // añado +1 a indice lista colores y reseteo contador para saber cuando hay siguiente 2 dígitos
                indice_color++;
                contador=0;

            }
        }


        return diccionario_rgb;
    }

    public static void main(String[] args) {
        System.out.println(rgb.extractRGBValues("#ffffff"));
    }
}
