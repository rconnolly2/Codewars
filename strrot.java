public class strrot {
    public static int shiftedDiff(String first, String second) {
        int cant = 0;
        if (first.equals(second)) {
            return 0;
        }
        
        for (int i=first.length()-1; i>=0; i--) {
            String tmp = first.substring(first.length()-1);
            first=tmp+first.substring(0, first.length()-1);
            // compruebo si es igual a str second
            cant++;
            System.out.println(first);
            if (first.equals(second)) {
                return cant;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(shiftedDiff("coffee", "eecoff"));
    }
}
