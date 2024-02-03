
public class numberexp {
    public static String expandedForm(int num) {
        String[] num_str = Integer.toString(num).split("");
        StringBuilder resultado = new StringBuilder();
        int pos_num = num_str.length-1;
        int digito = 0;

        for (int i=0; i<=num_str.length-1; i++) {
            digito = Integer.parseInt(num_str[i]);
            if (digito!=0) {
                if (resultado.length() > 0) {
                    resultado.append(" + ");
                }
                resultado.append(digito*(int) Math.pow(10, pos_num));
            }
            pos_num--;
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }
}
