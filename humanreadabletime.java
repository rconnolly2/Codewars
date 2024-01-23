import java.util.Arrays;

public class humanreadabletime {
    public static String formatDuration(int seconds) {
        int[] lista_tiempo = new int[]{0, 0, 0, 0, 0};
        String[] str_tiempo = new String[]{"year", "day", "hour", "minute", "second"};
        String resultado = "";

        if (seconds==0) {
            return "now";
        }

        while(true) {
            if (seconds==0) {
                break;
            }

            if (seconds>=31536000) {
                seconds -= 31536000;
                lista_tiempo[0] += 1;
            } else if (seconds>=86400) { // posiblemente segundos mes este mal y año 
                seconds -= 86400;
                lista_tiempo[1] += 1;
            } else if (seconds>=3600) {
                seconds -= 3600;
                lista_tiempo[2] += 1;
            } else if (seconds>=60) {
                seconds -= 60;
                lista_tiempo[3] += 1;
            } else {
                seconds -= 1;
                lista_tiempo[4] += 1;
            }
        }

        for (int i=0; i<=lista_tiempo.length-1; i++) {
            if (lista_tiempo[i]>1) {
                if (resultado != "") {
                    resultado += (", " + lista_tiempo[i] + " " + str_tiempo[i]+"s");
                } else {
                    resultado += (lista_tiempo[i] + " " + str_tiempo[i]+"s");   
                }
            } else if (lista_tiempo[i]==1) {
                if (resultado != "") {
                    resultado += (", " + lista_tiempo[i] + " " + str_tiempo[i]);
                } else {
                    resultado += (lista_tiempo[i] + " " + str_tiempo[i]);   
                }
            }
        }
        if (resultado.contains(",")) {
            StringBuilder Obj_str_builder = new StringBuilder(resultado);
            Obj_str_builder.replace(resultado.lastIndexOf(","), resultado.lastIndexOf(",")+1, " and");
            resultado = Obj_str_builder.toString();
        }



        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(345000));
    }
}
