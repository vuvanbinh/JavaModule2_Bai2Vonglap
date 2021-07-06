package Bai2_Vonglap.TH;

import java.util.Scanner;

public class TH2_laixuatthang {
    public static void main(String[] args) {
        double sotien,laisuat,sothang,tienlai = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui ");
        sotien = sc.nextDouble();
        System.out.println("Nhap so lai suat/nam ");
        laisuat = sc.nextDouble();
        System.out.println("Nhap so thang gui ");
        sothang = sc.nextDouble();
        for(int i = 0; i<sothang;i++){
            tienlai += sotien*((laisuat/100)/12)*sothang;
        }
        System.out.println("So tien lai sau "+sothang+" la : " +tienlai);
    }
}
