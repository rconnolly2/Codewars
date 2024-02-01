public class middleletter {
    public static String getMiddle(String word) {
        if (word.length()%2==0) {
            int pos = (int)Math.floor((0+word.length()-1)/2);
            return ""+word.charAt(pos)+word.charAt(pos+1);
        } else {
            return ""+word.charAt((int)Math.floor((word.length()-1)/2));
        }
      }

      public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
      }
}
