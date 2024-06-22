package Tugas_Akhir.DoubleLinked_List;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        DoubleLinkedList27 list = new DoubleLinkedList27();
        list.addLast(new Mahasiswa27("001", "Alice", "2000-01-01", "Teknik Informatika", 2018, "Jl. A"));
        list.addLast(new Mahasiswa27("004", "Diana", "2003-04-04", "Sistem Informasi", 2020, "Jl. D"));
        list.addLast(new Mahasiswa27("002", "Bob", "2001-02-02", "Teknik Informatika", 2019, "Jl. B"));
        list.addLast(new Mahasiswa27("003", "Charlie", "2002-03-03", "Sistem Informasi", 2019, "Jl. C"));
        list.addLast(new Mahasiswa27("005", "Sigit", "2002-01-05", "Teknik Informatika", 2019, "Jl. C"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Akses Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("5. Cari Mahasiswa berdasarkan NIM");
            System.out.println("6. Cari Mahasiswa berdasarkan Nama");
            System.out.println("7. Perbarui Data Mahasiswa");
            System.out.println("8. Jumlah Mahasiswa");
            System.out.println("9. Ekspor Data ke File");
            System.out.println("10. Sorting Mahasiswa berdasarkan Nama");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahMahasiswa(scanner, list);
                    break;
                case 2:
                    hapusMahasiswa(scanner, list);
                    break;
                case 3:
                    aksesMahasiswa(scanner, list);
                    break;
                case 4:
                    cetakSemuaMahasiswa(list);
                    break;
                case 5:
                    cariMahasiswaBerdasarkanNIM(scanner, list);
                    break;
                case 6:
                    cariMahasiswaBerdasarkanNama(scanner, list);
                    break;
                case 7:
                    perbaruiDataMahasiswa(scanner, list);
                    break;
                case 8:
                    tampilkanStatistikMahasiswa(list);
                    break;
                case 9:
                    eksporDataKeFile(scanner, list);
                    break;
                case 10:
                    list.sortByName();
                    System.out.println("Mahasiswa telah disortir berdasarkan nama.");
                    System.out.println();
                    System.out.println("Mahasiswa Setelah Di Sorting Berdasarkan Nama (Ascending)");
                    cetakSemuaMahasiswa(list);
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);
    }

    private static void tambahMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tglLahir = scanner.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = scanner.nextLine();
        System.out.print("Angkatan: ");
        int angkatan = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();

        if (nim.isEmpty() || nama.isEmpty() || !tglLahir.matches("\\d{4}-\\d{2}-\\d{2}") || jurusan.isEmpty() || alamat.isEmpty()) {
            System.out.println("Data tidak valid.");
            return;
        }

        list.addLast(new Mahasiswa27(nim, nama, tglLahir, jurusan, angkatan, alamat));
    }

    private static void hapusMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        list.remove(nim);

        System.out.println("Mahasiswa dengan NIM : " + nim + " Telah dihapus");
    }

    private static void aksesMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa27 mhs = list.get(nim);
        if (mhs != null) {
            System.out.println(mhs);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void cetakSemuaMahasiswa(DoubleLinkedList27 list) {
        list.printAll();
    }

    private static void cariMahasiswaBerdasarkanNIM(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa27 mhs = list.get(nim);
        if (mhs != null) {
            System.out.println(mhs);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void cariMahasiswaBerdasarkanNama(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        if (nama.equalsIgnoreCase(nama)) {
            list.searchByName(nama);          
        }else{
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void perbaruiDataMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Nama baru: ");
        String nama = scanner.nextLine();
        System.out.print("Tanggal Lahir baru (yyyy-mm-dd): ");
        String tglLahir = scanner.nextLine();
        System.out.print("Jurusan baru: ");
        String jurusan = scanner.nextLine();
        System.out.print("Angkatan baru: ");
        int angkatan = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Alamat baru: ");
        String alamat = scanner.nextLine();

        list.update(nim, nama, tglLahir, jurusan, angkatan, alamat);
        System.out.println("Data telah diperbarui.");
    }

    private static void tampilkanStatistikMahasiswa(DoubleLinkedList27 list) {
        System.out.println("Jumlah total mahasiswa: " + list.count());
    }

    private static void eksporDataKeFile(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("Masukkan nama file: ");
        String filename = scanner.nextLine();
        list.exportToFile(filename);
    }
}
