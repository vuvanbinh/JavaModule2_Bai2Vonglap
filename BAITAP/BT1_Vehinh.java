package Bai2_Vonglap.BAITAP;

import java.util.Scanner;

public class BT1_Vehinh {
    public static void main(String[] args) {
        System.out.println("Menu :");
        System.out.println("1 . In hinh chu nhat.");
        System.out.println("2 . In hinh tam giac vuong");
        System.out.println(" 3 . In tam giac vuong o top");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println("1 . In hinh chu nhat.");
                for (int i = 0; i < 3; i++) {
                    if(i==i){
                        System.out.println();
                    }
                    for (int j = 0; j < 7; j++) {
                        System.out.print("* ");
                    }
                }
            break;

            case 2 :
                System.out.println("2 . In hinh tam giac vuong");
                for (int i = 0; i < 6; i++) {
                    if(i==i){
                        System.out.println();
                    }
                    for (int j = 0; j < 6; j++) {
                       if(j<i){
                           System.out.print("* ");
                       }
                    }
                }
            break;

            case 3 :
                System.out.println("3 . In tam giac vuong o top");
                for (int i = 7; i > 0; i--) {
                    if(i==i){
                        System.out.println();
                    }
                    for (int j = 0; j < 7; j++) {
                        if(j<i){
                            System.out.print("* ");
                        }
                    }
                }
                break;


        }




    }
}
