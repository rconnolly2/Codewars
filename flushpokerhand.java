import java.util.*; 

public class flushpokerhand {
    public static boolean CheckIfFlush(String[] cards){
        //Write some code here
           char tipo_carta = '0';

           for (String i : cards) {
                if (i==cards[0]) {
                    tipo_carta = i.charAt(i.length()-1); // si es el primero cojo el tipo de carta
                    continue;
                }
                
                if (i.charAt(i.length()-1)!=tipo_carta) {
                    return false;
                }

           }

           return true;
        }

        public static void main(String[] args) {
            System.out.println(CheckIfFlush(new String[]{"AS", "3S", "9S", "KS", "4S"}));
        }
}
