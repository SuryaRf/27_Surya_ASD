package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainPangkat27 {
    public static void main(String[] args) {
        
        Scanner sc27 = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukan jumlah elemen yang ingin di hitung: ");
        int elemen = sc27.nextInt();
        
        Pangkat27[] png = new Pangkat27[elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai yang akan dipangkatkan ke- " + (i+1)+ " : ");
            png[i] = new Pangkat27();
            png[i].nilai = sc27.nextInt();
            System.out.print("Masukan nilai pemangkat ke- " + (i+1) + " : ");
            png[i].pangkat = sc27.nextInt();
            
        }
        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Brute Force: ");
        
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + "adalah " + png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");


        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer: ");
        
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + "adalah " + png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        System.out.println("===================================================");
    }
    
}
