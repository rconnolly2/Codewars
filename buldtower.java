import java.util.ArrayList;

public class buldtower {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        int zeros=5;
        for (int i=0; i<=5; i++) {
            String str = "";

            //añado zeros
            for (int j=1; j<=zeros; j++) {
                str+=" ";
            }

            for (int j=1; j<=2*i+1; j++) {
                str+="*";
            }

            //añado zeros
            for (int j=1; j<=zeros; j++) {
                str+=" ";
            }
            lista.add(str);
            zeros--;
        }

        String[] resultado_str = new String[lista.size()];
        for (int i=0; i<=lista.size()-1; i++) {
            resultado_str[i] = lista.get(i);
        }

        return resultado_str;
    }
    
}
