public class SnakeLadders {
    public int[][] escaleras = {{2, 38}, {7, 14}, {8, 31}, {15, 26}, {28, 84}, {21, 42}, {36, 44}, {51, 67}, {71, 91}, {78, 98}, {87, 94}};
    public int[][] serp = {{16, 6}, {46, 25}, {49, 11}, {62, 19}, {64, 60}, {74, 53}, {89, 68}, {92, 88}, {95, 75}, {99, 80}};
    public int pos_j1 = 0;
    public int pos_j2 = 0;
    public int turno = 1;
    public boolean curso = true;
    public String play(int die1, int die2) {
        if (!curso) {
            return "Game over!";
        }
    
        int total_dados = die1 + die2;
        int t_ant = turno;
    
        if (turno == 1) {
            pos_j1 = JugadorMasCien(pos_j1, total_dados);
            pos_j1 = CheckEscSerp(pos_j1);
            if (pos_j1 == 100) {
                curso = false;
                if (die1 != die2) {
                    return "Player " + turno + " Wins!";
                }
            }
        } else {
            pos_j2 = JugadorMasCien(pos_j2, total_dados);
            pos_j2 = CheckEscSerp(pos_j2);
            if (pos_j2 == 100) {
                curso = false;
                if (die1 != die2) {
                    return "Player " + turno + " Wins!";
                }
            }
        }
    
        if (die1 != die2) {
            turno = turno == 1 ? 2 : 1;
        }
    
        return "Player " + t_ant + " is on square " + (t_ant == 1 ? pos_j1 : pos_j2);
    }

    public int JugadorMasCien(int pos_jug, int total_dad) {
        int nuev_pos = pos_jug + total_dad;

        if (nuev_pos > 100) {
            nuev_pos = 100 - (nuev_pos - 100);
        }
        return nuev_pos;
    }

    public int CheckEscSerp(int pos_jug) {
        // Cae en escaleras:
        for (int i=0; i<=this.escaleras.length-1; i++) {
            if (this.escaleras[i][0]==pos_jug) {
                return this.escaleras[i][1]; // Hacia arriba!
            }
        }
        // Cae en serpientes
        for (int i=0; i<=this.serp.length-1; i++) {
            if (this.serp[i][0]==pos_jug) {
                return this.serp[i][1]; // Vuelve atrás!
            }
        }

        return pos_jug; // todo bien
    }

}
