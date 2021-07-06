package Bai2_Vonglap.TH;

import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra :");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(" Khong phai la so nguyen to ");
        } else {
            int i = 2;
            boolean check = true;
            while (i < Math.sqrt(number)) {
                check = false;
                break;
            }
            i++;
            if (check) {
                System.out.println(number + " La so nguyen to");
            } else {
                System.out.println(number + " Khong la so nguyen to");
            }
        }
    }
}
