public class removefirstandlast {
    public static String remove(String str) {

        String nuevo_str = "";

        for (int i=0; i<=str.length()-1; i++) {
            if (i==0 || i==str.length()-1) {
                continue;
            }
            nuevo_str += str.charAt(i);
        }

        return nuevo_str;
    }
}
