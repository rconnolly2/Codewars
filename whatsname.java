public class whatsname {

    public static boolean nameInStr(String str, String name) {
        int indice_nom = 0;
        for (int i=0; i<=str.length()-1; i++) {
            if (indice_nom<name.length() && Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(name.charAt(indice_nom))) {
                indice_nom++;
            }
        }
        if (indice_nom==name.length()) {
            return true;
        } else {
            return false;
        }
    }
}
