import java.util.Arrays;

public class stripcomments {
    public static void stripComments(String text, String[] commentSymbols) {
        String[] string_separado = text.split("\n");
        System.out.println(Arrays.toString(string_separado));
        for (String cadena : string_separado) {
            System.out.println(cadena);
        }

    //     for (int i=0; i<=commentSymbols.length-1; i++) {
    //         for (int j=0; j<=text.length()-1; j++) {
    //             if (commentSymbols[i].charAt(0) == text.charAt(j)) {
    //                 System.out.print(text.charAt(j) + " " + text.charAt(text.indexOf("s", j)));
    //             }
    //         } 
    //     }
	// }
    }

    public static void main(String[] args) {
        stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } );
    }
}
