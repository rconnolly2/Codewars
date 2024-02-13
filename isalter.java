public class isalter {
    public static boolean isAlt(String word) {
        boolean ant_voc;
        for (int i=0; i<=word.length()-1; i++) {
            if (!(i+1>word.length()-1)) { // no outbound
                ant_voc=EsVocal(word.charAt(i));
                if (ant_voc==EsVocal(word.charAt(i+1))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean EsVocal(Character car) {
        Character let = Character.toLowerCase(car);
        if (let=='a' || let=='e' || let=='i' || let=='o' || let=='u') {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAlt("mouvufw"));
    }
}
