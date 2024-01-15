public class dontgivemefive {
    public static int dontGiveMeFive(int start, int end)
    {
      int r = 0;
      for (int j=start; j<=end; j++) {
        r += (j==5 || j<0 || j%10==5) ? 0 : 1;
      }
      return r;
    }
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4, 17));
    }
}
