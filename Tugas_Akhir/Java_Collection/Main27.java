package Tugas_Akhir.Java_Collection;

import java.util.Scanner;

import java.util.ArrayList;


public class Main27 {
    public static void main(String[] args) {
        // Memanggil Gudang dengan inisialisasi data awal
        Gudang27 gudang = new Gudang27(initializeData());
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahBarang(scanner, gudang);
                    break;
                case 2:
                    hapusBarang(scanner, gudang);
                    break;
                case 3:
                    cariBarangByKode(scanner, gudang);
                    break;
                case 4:
                    cariBarangByNama(scanner, gudang);
                    break;
                case 5:
                    gudang.sortBarangByKode();
                    break;
                case 6:
                    gudang.sortBarangByNama();
                    break;
                case 7:
                    gudang.sortBarangByBerat();
                    break;
                case 8:
                    gudang.cetakSemuaBarang();
                    break;
                case 0:
                System.out.println("\u001B[31mKeluar Dari Sistem.\u001B[0m");
                    break;
                default:
                    System.out.println("\u001B[31mPilihan tidak valid.\u001B[0m");
            }
        } while (choice != 0);
    }

    private static void tambahBarang(Scanner scanner, Gudang27 gudang) {
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine();
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Stok Barang: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Berat Barang: ");
        double berat = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Jenis Barang: ");
        String jenis = scanner.nextLine();
        System.out.print("Satuan Barang: ");
        String satuan = scanner.nextLine();
        System.out.print("Harga Beli: ");
        double hargaBeli = scanner.nextDouble();
        System.out.print("Harga Jual: ");
        double hargaJual = scanner.nextDouble();
        
        gudang.tambahBarang(kodeBarang, namaBarang, stok, berat, jenis, satuan, hargaBeli, hargaJual);
        System.out.println();
    }
    

    private static void hapusBarang(Scanner scanner, Gudang27 gudang) {
        System.out.print("Kode Barang yang akan dihapus: ");
        String kodeBarang = scanner.nextLine();

        gudang.hapusBarang(kodeBarang);
        System.out.println();
    }

    private static void cariBarangByKode(Scanner scanner, Gudang27 gudang) {
        System.out.print("Kode Barang: ");
        String kodeBarang = scanner.nextLine();

        gudang.searchBarangByKode(kodeBarang);
        System.out.println();
    }

    private static void cariBarangByNama(Scanner scanner, Gudang27 gudang) {
        System.out.print("Nama Barang: ");
        String namaBarang = scanner.nextLine();

        gudang.searchBarangByNama(namaBarang);
        System.out.println();
    }

    // Metode untuk inisialisasi data awal
    private static ArrayList<Barang27> initializeData() {
        ArrayList<Barang27> dataAwal = new ArrayList<>();
        dataAwal.add(new Barang27("B001", "Pensil", 100, 0.1, "Alat Tulis", "Buah", 500, 1000));
        dataAwal.add(new Barang27("B002", "Buku Tulis", 50, 0.5, "Alat Tulis", "Buah", 1500, 2000));
        dataAwal.add(new Barang27("B003", "Pensil Warna", 80, 0.2, "Alat Tulis", "Buah", 800, 1200));
        dataAwal.add(new Barang27("B004", "Spidol", 70, 0.3, "Alat Tulis", "Buah", 1000, 1500));
        return dataAwal;
    }

    private static void printMenu() {
        final String BLUE = "\033[0;34m";
        final String RESET = "\033[0m";
        String[] menuItems = {
            "1. Tambah Barang",
            "2. Hapus Barang",
            "3. Cari Barang berdasarkan Kode",
            "4. Cari Barang berdasarkan Nama",
            "5. Urutkan Barang berdasarkan Kode Barang",
            "6. Urutkan Barang berdasarkan Nama Barang",
            "7. Urutkan Barang berdasarkan Berat",
            "8. Cetak Semua Barang",
            "0. Keluar"
        };
        System.out.println("");
        System.out.println(BLUE + "                Selamat Datang               ");
        System.out.println("   Sistem Gudang Penyimpanan CV. Surya Permata" + RESET);
        System.out.println("+-----------------------------------------------+");
        System.out.println("|                    Menu                       |");
        System.out.println("+-----------------------------------------------+");

        for (String item : menuItems) {
            System.out.printf("| %-45s |\n", item);
        }

        System.out.println("+-----------------------------------------------+");
        System.out.print("Pilih: ");
    }
}
