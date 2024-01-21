    public static boolean CheckIfFlush(String[] cards){
        //Write some code here
           char tipo_carta = '0';

           for (String i : cards) {
                if (i==cards[0]) {
                    tipo_carta = i.charAt(1); // si es el primero cojo el tipo de carta
                    continue;
                }
                
                if (i.charAt(1)!=tipo_carta) {
                    return false;
                }

           }

           return true;
        }