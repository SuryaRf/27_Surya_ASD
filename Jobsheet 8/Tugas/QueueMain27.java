package Tugas;

import java.util.Scanner;

public class QueueMain27 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Pasien Baru");
        System.out.println("2. Layani Pasien");
        System.out.println("3. Cek Pasien Terdepan");
        System.out.println("4. Cek Pasien Terbelakang");
        System.out.println("5. Cari Posisi Pasien");
        System.out.println("6. Daftar Seluruh Pasien");
        System.out.println("7. Keluar");
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = input.nextInt();
        Queue27 antrian = new Queue27(kapasitas);

        int pilihan;
        do {
            menu();
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            input.nextLine(); // untuk membaca karakter newline
            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Nomor ID: ");
                    int noID = input.nextInt();
                    System.out.print("Jenis Kelamin: ");
                    char jenisKelamin = input.next().charAt(0);
                    System.out.print("Umur: ");
                    int umur = input.nextInt();
                    Pasien27 pasienBaru = new Pasien27(nama, noID, jenisKelamin, umur);
                    antrian.enqueue(pasienBaru);
                    break;
                case 2:
                    Pasien27 pasienLayani = antrian.dequeue();
                    System.out.println("Pasien yang dilayani: " + pasienLayani.nama);
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pasien yang ingin dicari: ");
                    String namaCari = input.nextLine();
                    int posisi = antrian.peekPosition(namaCari);
                    if (posisi != -1) {
                        System.out.println("Posisi pasien " + namaCari + " dalam antrian: " + posisi);
                    } else {
                        System.out.println("Pasien " + namaCari + " tidak ditemukan dalam antrian.");
                    }
                    break;
                case 6:
                    antrian.daftarPasien();
                    break;
                case 7:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 7);
        input.close();
    }
}
