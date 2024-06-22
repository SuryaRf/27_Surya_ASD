package Tugas_Akhir.DoubleLinked_List;

import java.util.Scanner;

public class Main27 {
    public static void main(String[] args) {
        DoubleLinkedList27 list = new DoubleLinkedList27();
        list.addLast(new Mahasiswa27("001", "Anisa", "2000-01-01", "Teknik Informatika", 2018, "Jl. A", "Perempuan"));
        list.addLast(new Mahasiswa27("004", "Diana", "2003-04-04", "Sistem Informasi", 2020, "Jl. D", "Perempuan"));
        list.addLast(new Mahasiswa27("002", "Boby", "2001-02-02", "Teknik Informatika", 2019, "Jl. B", "Laki-laki"));
        list.addLast(new Mahasiswa27("003", "Bagus", "2002-03-03", "Sistem Informasi", 2019, "Jl. C", "Laki-laki"));
        list.addLast(new Mahasiswa27("005", "Sigit", "2002-01-05", "Teknik Informatika", 2019, "Jl. C", "Laki-laki"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            printMenu();
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
                    System.out.println("\u001B[34mMahasiswa telah disortir berdasarkan nama.");
                    System.out.println();
                    System.out.println("Mahasiswa Setelah Di Sorting Berdasarkan Nama (Ascending)\u001B[0m");

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

    private static void printMenu() {
        System.out.println("");
        System.out.println("\u001B[34m        SELAMAT DATANG DI SISTEM INPUT DATA");
        System.out.println("                 MAHASISWA POLINEMA\u001B[0m");
        String[][] menuItems = {
                { "1", "Tambah Mahasiswa" },
                { "2", "Hapus Mahasiswa" },
                { "3", "Akses Mahasiswa" },
                { "4", "Cetak Semua Mahasiswa" },
                { "5", "Cari Mahasiswa berdasarkan NIM" },
                { "6", "Cari Mahasiswa berdasarkan Nama" },
                { "7", "Perbarui Data Mahasiswa" },
                { "8", "Jumlah Mahasiswa" },
                { "9", "Ekspor Data ke File" },
                { "10", "Sorting Mahasiswa berdasarkan Nama" },
                { "0", "Keluar" }
        };

        System.out.println("+----+---------------------------------------------+");
        System.out.println("| No | Pilihan Menu                                |");
        System.out.println("+----+---------------------------------------------+");

        for (String[] item : menuItems) {
            System.out.printf("| %-2s | %-43s |\n", item[0], item[1]);
        }

        System.out.println("+----+---------------------------------------------+");
        System.out.print("Pilih: ");
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
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = scanner.nextLine();

        if (nim.isEmpty() || nama.isEmpty() || !tglLahir.matches("\\d{4}-\\d{2}-\\d{2}") || jurusan.isEmpty()
                || alamat.isEmpty() || jenisKelamin.isEmpty()) {
            System.out.println("Data tidak valid.");
            return;
        }

        list.addLast(new Mahasiswa27(nim, nama, tglLahir, jurusan, angkatan, alamat, jenisKelamin));
        System.out.println("\u001B[32mBerhasil Menambahkan Data Mahasiswa\u001B[0m");
    }

    private static void hapusMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        list.remove(nim);

        System.out.println("\u001B[32mMahasiswa dengan NIM : " + nim + " Telah dihapus\u001B[0m");
    }

    private static void aksesMahasiswa(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa27 mhs = list.get(nim);
        if (mhs != null) {
            System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
            System.out.println(
                    "| NIM        | Nama           | Tgl Lahir   | Jurusan            | Angkatan  | Alamat           | Jenis Kelamin |");
            System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
            System.out.printf("| %-10s | %-14s | %-11s | %-18s | %-9d | %-16s | %-13s |\n",
                    mhs.getNim(), mhs.getNama(), mhs.getTglLahir(), mhs.getJurusan(), mhs.getAngkatan(),
                    mhs.getAlamat(), mhs.getJenisKelamin());
            System.out.println(
                    "+------------+----------------+-------------+--------------------+-----------+------------------+---------------+");
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
            System.out.println("\u001B[32m" + mhs + " \u001B[0m");
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }

    private static void cariMahasiswaBerdasarkanNama(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        list.searchByName(nama);
        if (nama.equalsIgnoreCase(nama)) {
            list.searchByName("\u001B[32m" + nama + " \u001B[0m");
        } else {
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
        System.out.print("Jenis Kelamin baru: ");
        String jenisKelamin = scanner.nextLine();

        list.update(nim, nama, tglLahir, jurusan, angkatan, alamat, jenisKelamin);
        System.out.println("\u001B[32mData telah diperbarui.\u001B[0m");
    }

    private static void tampilkanStatistikMahasiswa(DoubleLinkedList27 list) {
        int totalMahasiswa = list.count();
        String blue = "\u001B[34m";
        String reset = "\u001B[0m";

        System.out.println(blue + "+----------------------------+");
        System.out.println("|   Jumlah Total Mahasiswa   |");
        System.out.println("+----------------------------+" + reset);
        System.out.printf("| %26d |%n", totalMahasiswa);
        System.out.println("+----------------------------+");
    }

    private static void eksporDataKeFile(Scanner scanner, DoubleLinkedList27 list) {
        System.out.print("Masukkan nama file: ");
        String filename = scanner.nextLine();
        list.exportToFile(filename);
    }
}
