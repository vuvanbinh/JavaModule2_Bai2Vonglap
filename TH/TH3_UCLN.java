package Bai2_Vonglap.TH;

import java.util.Scanner;

public class TH3_UCLN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a :");
        a = sc.nextInt();
        System.out.println("Nhap b :");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println(" Khong co uoc chung lon nhat : ");
        }
        while (a!=b){
            if (a>b)
                a = a- b;
            else
                b = b-a;
        }
        System.out.println(" Uoc chung lon nhat la :" + b);

    }
}
