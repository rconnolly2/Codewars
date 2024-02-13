import java.util.List;

public class countsmile {
      public static int countSmileys(List<String> arr) {
        Integer contador = 0;
      // Just Smile :)
      for (String str : arr) {
        if ((str.charAt(str.length()-1)==')' || str.charAt(str.length()-1)=='D') && (str.charAt(0)==':' || str.charAt(0)==';') && str.length()==2){
            contador++;
        } else if (((str.charAt(str.length()-1)==')' || str.charAt(str.length()-1)=='D') && (str.charAt(0)==':' || str.charAt(0)==';') && () && str.length()==3))
      }
      return contador;
    }
}
