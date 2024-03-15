package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainSum27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukan Jumlah Bulan: ");
        int elm = sc.nextInt();
        
        Sum27 sm = new Sum27(elm);
        System.out.println("====================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukan untung bulan ke - " + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        
        System.out.println("====================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama" + sm.elemen + "bulan adalah = "+ sm.totalBF(sm.keuntungan));
        System.out.println("====================================================");
        System.out.println("Algoritma Divide Convide");
        System.out.println("Total keuntungan perusahaan selama" + sm.elemen + "bulan adalah = "+ sm.totalDC(sm.keuntungan,0, sm.elemen-1));
    }
    
}
