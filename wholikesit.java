import java.util.ArrayList;
import java.util.Arrays;

public class wholikesit {
    public static String whoLikesIt(String... names) {
        ArrayList<String> arr = new ArrayList<String>();
        for (String str : names) {
            arr.add(str);
        }
        int len = arr.size();
        switch (len) {
            case 0:
                return "no one likes this";
            case 1:
                return arr.get(0)+" likes this";
            case 2:
                return arr.get(0)+" and "+arr.get(1)+" like this";
            case 3:
                return arr.get(0)+", "+arr.get(1)+" and "+arr.get(2)+" like this";
            default:
                return arr.get(0)+", "+arr.get(1)+" and "+(len-2)+" others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jacob", "Alex"));
    }
}
