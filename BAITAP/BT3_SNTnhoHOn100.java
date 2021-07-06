package Bai2_Vonglap.BAITAP;

public class BT3_SNTnhoHOn100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (checkSTN(i))
                System.out.println(i);
        }
    }

    public static boolean checkSTN(int n) {
        boolean check = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
