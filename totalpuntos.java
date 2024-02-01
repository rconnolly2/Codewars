public class totalpuntos {
    public static int points(String[] games) {
        int x_puntos = 0;
        int p_x = 0, p_y = 0;
        for (int i=0; i<=games.length-1; i++) {
            p_x = Character.getNumericValue(games[i].charAt(0));
            p_y = Character.getNumericValue(games[i].charAt(2));
            
            if (p_x>p_y) {
                x_puntos+=3;
            } else if (p_x<p_y) {
                ;
            } else {
                x_puntos+=1;
            }
        }
        
        return x_puntos;
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]
        {"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
    }
}
