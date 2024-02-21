public class withdraw {
    public static int[] withdraw(int n) {
        int[] bill = new int[3];
        while (n>0) {
            if (100<=n && (((n-100)%50==0) || (n-100)%20==0)) {
                bill[0]+=1;
                n-=100;
                continue;
            }

            if (50<=n && ((n-50)%20==0)) {
                bill[1]+=1;
                n-=50;
                continue;
            }

            if (20<=n) {
                bill[2]+=1;
                n-=20;
            }
        }
        return bill;
    }

    public static void main(String[] args) {
        SacarD(230);
    }
}
