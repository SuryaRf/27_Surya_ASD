package Minggu7;

public class Mahasiswa27_3 {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa27_3(int ni, String n, int u, double i) {
        nim = ni;
        nama =n;
        umur = u;
        ipk = i;
    }
    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
} 