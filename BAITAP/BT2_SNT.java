package Bai2_Vonglap.BAITAP;

import java.util.Scanner;

public class BT2_SNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong acn in ra ");
        int number = sc.nextInt();
        int count = 0;
        int N = 2;
        while (count<number) {
            if (demo(N)){
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
    public static boolean demo(int n){
        boolean check = true;
        if(n<2) return false;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                check = false;
                break;
            }
        }
        return check;
    }
    }
