import java.util.Arrays;

public class stripcomments {
    public static String stripComments(String text, String[] commentMarkers) {
        String[] lineas = text.split("\n");

        // itero sobre cada lin
        for (int i = 0; i < lineas.length; i++) {
            // itero sobre cada char de comentario
            for (String comentario : commentMarkers) {
                // encuentro indice
                int indice = lineas[i].indexOf(comentario);

                // quito todo después de comentario
                if (indice != -1) { // si lo encuentra
                    lineas[i] = lineas[i].substring(0, indice);
                }
            }

            // elimina espacios al final del str
            lineas[i] = lineas[i].stripTrailing();
        }

        // concat al resultado
        return String.join("\n", lineas);
    }

    public static void main(String[] args) {
        System.out.print(stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
    }
}
