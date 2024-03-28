package Minggu7;

import java.util.Scanner;

public class MahasiswaMain27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs27 data = new PencarianMhs27();
        int jumMhs = 5;

        System.out.println("-----------------------------------------------");
        System.out.println("Masukan data mahasiswa secara Urut dari Nim Terkecil");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("--------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();


            Mahasiswa27 m = new Mahasiswa27(nim, nama, umur, ipk);
            data.tambah(m);
        }
       
    
        System.out.println("----------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM:  ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("Menggunakan Binary Search");
         posisi = data.FindBinarySearch(cari, 0, jumMhs -1 );
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
