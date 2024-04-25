package Praktikum2;

import java.util.Scanner;

public class QueueMain27_2 {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1.  Antrian Baru ");
        System.out.println("2.  Antrian Keluar "); 
        System.out.println("3.  Cek Antrian Terdepan "); 
        System.out.println("4.  Cek Semua Antrian "); 
        System.out.println("5.  Cek Antrian Paling Belakang "); 
        System.out.println("-------------------------------");

    }
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Scanner sc27_2 = new Scanner(System.in);
        int max;
        int pilih;
        System.out.print("Masukan kapasitas queue: ");
        int jumlah = sc27.nextInt();
        Queue27_2 antri = new Queue27_2(jumlah);



        do {
            menu();
            pilih = sc27.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc27_2.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc27_2.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc27_2.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc27.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc27.nextDouble();
                    Nasabah27 nb = new Nasabah27(norek, nama, alamat, umur, saldo);
                    sc27.nextLine();
                    antri.Enqueue_2(nb);
                    break;
                case 2:
                    Nasabah27 data = antri.Dequeue_2();
                    if (! " ".equals(data.norek) && ! "".equals(data.nama) && ! " ".equals(data.alamat) &&  data.umur != 0 &&  data.saldo !=0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek_2();
                    break;
                case 4:
                    antri.print_2();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            
                default:
                    break;
            }
            
        } while (pilih == 1 || pilih ==2 || pilih ==3 || pilih ==4 || pilih == 5);
    }
}
