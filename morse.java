import java.util.Arrays;

public class morse {
    public static String decode(String morseCode) {
        String resultado = "";
        String[] arr_pal = morseCode.split("\\s{2}"); // dos espacios palabra

        for (int i=0; i<=arr_pal.length-1; i++) {

            String[] arr_letras = arr_pal[i].trim().split("\\s{1}"); // un espacio letra
            //System.out.println(Arrays.toString(arr_letras));
            for (String let : arr_letras) {
                //System.out.println(let);
                resultado+=Desenc_Letra(let);
            }

            if (i!=arr_pal.length-1) { // si no es la ultima palabra
                resultado+=" "; // espacio
            }

        }

        return resultado;
    }

    /**
     * Simplemente convierte carácter morse a String del carácter
     * String Morse
     * @return str carácter descifrado
     */
    public static String Desenc_Letra(String mor) {
        switch (mor) {
            case ".-":
                return "A";
            case "-...":
                return "B";
            case "-.-.":
                return "C";
            case "-..":
                return "D";
            case ".":
                return "E";
            case "..-.":
                return "F";
            case "--.":
                return "G";
            case "....":
                return "H";
            case "..":
                return "I";
            case ".---":
                return "J";
            case "-.-":
                return "K";
            case ".-..":
                return "L";
            case "--":
                return "M";
            case "-.":
                return "N";
            case "---":
                return "O";
            case ".--.":
                return "P";
            case "--.-":
                return "Q";
            case ".-.":
                return "R";
            case "...":
                return "S";
            case "-":
                return "T";
            case "..-":
                return "U";
            case "...-":
                return "V";
            case ".--":
                return "W";
            case "-..-":
                return "X";
            case "-.--":
                return "Y";
            case "--..":
                return "Z";
            case "-----":
                return "0";
            case ".----":
                return "1";
            case "..---":
                return "2";
            case "...--":
                return "3";
            case "....-":
                return "4";
            case ".....":
                return "5";
            case "-....":
                return "6";
            case "--...":
                return "7";
            case "---..":
                return "8";
            case "----.":
                return "9";
            case "···−−−···":
                return "SOS";
            default:
                return ""; // no valido
        }
    }

    public static void main(String[] args) {
        System.out.println(decode(".... . -.--   .--- ..- -.. ."));
    }


}
