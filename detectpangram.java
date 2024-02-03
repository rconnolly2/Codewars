import java.util.HashSet;
import java.util.Set;

public class detectpangram {
    public boolean check(String sentence) {
        Set<Character> set = new HashSet<Character>(); 

        for (char letra : sentence.toCharArray()) {
            if (letra != ' ') {
                set.add(Character.toLowerCase(letra));
            }

        }

        if (set.size() >= 26) {
            return true;
        } else {
            return false;
        }
    }
}
