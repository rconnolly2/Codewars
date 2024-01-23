import java.util.Arrays;

public class countip {
	public static long ipsBetween(String start, String end) {
        String[] ip1lista = start.split("\\.");
        String[] ip2lista = end.split("\\.");

        //saco total de ips multiplico num*256 elevado a la posición 
        long ip1bin = Long.parseLong(ip1lista[3]) + (Long.parseLong(ip1lista[2])*256) + (Long.parseLong(ip1lista[1])*256*256) + (Long.parseLong(ip1lista[0])*256*256*256);
        long ip2bin = Long.parseLong(ip2lista[3]) + (Long.parseLong(ip2lista[2])*256) + (Long.parseLong(ip2lista[1])*256*256) + (Long.parseLong(ip2lista[0])*256*256*256);

        return (Math.max(ip1bin, ip2bin)-Math.min(ip1bin, ip2bin)); // saco diferencia
	}

    public static void main(String[] args) {
        ipsBetween("0.0.0.0", "255.255.255.255");
    }
}
