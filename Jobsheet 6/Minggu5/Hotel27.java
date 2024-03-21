package Minggu5;

public class Hotel27 {
    String nama;
    String kota;
    int harga;
    byte bintang;

       public Hotel27 (String n, String k, int ha, byte b){
            nama = n;
            kota = k;
            harga = ha;
            bintang = b;
        }
    void tampil(){
        System.out.println("Nama = " + nama);
        System.out.println("Kota = " + kota);
        System.out.println("harga = " + harga);
        System.out.println("bintang = " + bintang);
    }
}
