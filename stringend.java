public class stringend {
    public static boolean solution(String str, String ending) {

        int j=0;
        for(int i=ending.length()-1; i>=0; i--) {
            if((str.length()-1-j)<0 || str.charAt((str.length()-1)-j)!=ending.charAt(i)) {
              return false;
            } else {
                j++;
            }
        }
        
        return true;
        
      }

      public static void main(String[] args) {
        System.out.println(solution("abc\n", "abc"));
      }


}
