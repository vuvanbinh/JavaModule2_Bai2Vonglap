package Bai2_Vonglap.TH;

import java.util.Scanner;

public class TH4_MenuForUD {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println();
            System.out.println(" Menu ");
            System.out.println("1. Hinh Tam Giac ");
            System.out.println("2 . Hinh Vuong");
            System.out.println("3 . Hinh Chu Nhat");
            System.out.println("0 . Exit");
            System.out.println("Nhap lua chon :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Hinh Tam Giac ");
                    for (int i = 1; i <= 7; i++) {
                        if (i == i) {
                            System.out.println();
                        }
                        for (int j = 7; j >= 0; j--) {
                            if (j >= i) {
                                System.out.print("*");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("2 . Hinh Vuong");
                    for (int i = 0; i <= 7; i++) {
                        if (i == i) {
                            System.out.println();
                        }
                        for (int j = 7; j >= 0; j--) {
                                System.out.print("* ");
                        }
                    }
                    break;

                case 3:
                    System.out.println("3 . Hinh Chu Nhat");
                    for (int i = 1; i <= 4; i++) {
                        if (i == i) {
                            System.out.println();
                        }
                        for (int j = 7; j >= 0; j--) {
                            System.out.print("* ");
                        }
                    }
                    break;
                case 0 :
                    System.out.println(0);
                default:
                    System.out.println(" khong co chon");
            }
        }
    }
}
