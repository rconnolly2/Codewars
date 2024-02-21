public class airstrike {
    public static String alphabetWar(String fight) {
        int p_izq = 0;
        int p_der = 0;
        for (int i=0; i<=fight.length()-1; i++) {
            Character ch = fight.charAt(i);
            if (ch!='*') {
                int[] bando_val = BandoValor(ch);
                if (bando_val[0]==1 || bando_val[0]==2) {
                    if (!(i-1<0)) { // si atrás no es index out of bounds
                        if (fight.charAt(i-1)=='*') {
                            continue; // char muere en bomba paso al siguiente char
                        }
                    }

                    if (!(i+1>fight.length()-1)) { // si delante no es index out of bounds
                        if (fight.charAt(i+1)=='*') {
                            continue; // char muere en bomba paso al siguiente char
                        }
                    }

                    // Si no hay bomba delante o detrás
                    if (bando_val[0]==1) { // sumo puntuación según su bando y el valor del char
                        p_izq+=bando_val[1];
                    } else {
                        p_der+=bando_val[1];
                    }
                }
            }
        }

        if (p_izq>p_der) {
            return "Left side wins!";
        } else if (p_der>p_izq) {
            return "Right side wins!";
        } else {
            return "Let's fight again!";
        }
    }

    public static int[] BandoValor(Character ch) {
        int[] res = new int[2];

        switch (ch) {
            case 'w':
                res[0] = 1;
                res[1] = 4;
                break;
            case 'p':
                res[0] = 1;
                res[1] = 3;
                break;
            case 'b':
                res[0] = 1;
                res[1] = 2;
                break;
            case 's':
                res[0] = 1;
                res[1] = 1;
                break;
            case 'm':
                res[0] = 2;
                res[1] = 4;
                break;
            case 'q':
                res[0] = 2;
                res[1] = 3;
                break;
            case 'd':
                res[0] = 2;
                res[1] = 2;
                break;
            case 'z':
                res[0] = 2;
                res[1] = 1;
                break;
            default:
                break; // devuelvo 0 0

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("*wwwwww*z*"));
    }
}
