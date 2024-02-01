import java.util.Arrays;

public class strrev {
    public static String[] reverseWords(final String original)
    {
      String[] letras = original.split("\s+");
      return original.split("[^ ]");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseWords("double  spaced  words")));
    }
}
