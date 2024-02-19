public class basciency {
    public static String encrypt(String text, int rule) {
       
        String res = "";

        for (int i=0; i<=text.length()-1; i++) {
            res+= (char) ((text.charAt(i)+rule) % 256);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("a", 1));
    }
}
