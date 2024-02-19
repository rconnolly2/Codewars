import java.util.HashMap;

public class firstnonrepeat {
    public static String firstNonRepeatingLetter(String s) {
        HashMap<Character, Integer> dic_contad = new HashMap<Character, Integer>();


        for (int i=0; i<=s.length()-1; i++) {
            Character car = Character.toLowerCase(s.charAt(i));
            if (!(dic_contad.containsKey(car))) { // si no tiene el carácter
                dic_contad.put(car, 1); // pongo key con un contador
            } else {
                dic_contad.put(car, dic_contad.get(car)+1); // añado uno al contador del char
            }
        }

        // de izq a der cojo el char que solo tenga 1 aparición
        for (int i=0; i<=s.length()-1; i++) {
            Character car = Character.toLowerCase(s.charAt(i));
            if (dic_contad.get(car)==1) {
                return ""+s.charAt(i); // devuelvo carácter en str
            }
        }

        return ""; // si no hay nada con 1 contador
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("a"));
    }


}
