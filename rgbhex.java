public class rgbhex {
    public static String rgb(int r, int g, int b) {
        String colorhex = "";

        // me aseguro que esta en un rango valido entre 0 y 255
        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));
        // Convierto numero decimal a hexadecimal con una longitud de 2 dígitos/let
        String r_str = String.format("%02X", r);
        String g_str = String.format("%02X", g);
        String b_str = String.format("%02X", b);

        colorhex=r_str+g_str+b_str;

        return colorhex;
    }

    public static void main(String[] args) {
        System.out.println(rgb(-20, 275, 125));
    }
}
