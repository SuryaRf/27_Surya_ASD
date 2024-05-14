package Jobsheet12.DoubleLinkedList;

import java.util.Scanner;

public class MainFilm {
    public static void main(String[] args) {
        FilmList filmList = new FilmList();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\u001B[33m+------------------------------------------+");
            System.out.println("|          DATA FILM LAYAR LEBAR           |");
            System.out.println("+------------------------------------------+\u001B[0m");
            System.out.println("\nMenu:");
            System.out.println("+------------------------------------------+");
            System.out.println("1.  Tambah Data Awal");
            System.out.println("2.  Tambah Data Akhir");
            System.out.println("3.  Tambah Data pada Index Tertentu");
            System.out.println("4.  Hapus Data Pertama");
            System.out.println("5.  Hapus Data Terakhir");
            System.out.println("6.  Hapus Data pada Index Tertentu");
            System.out.println("7.  Cetak Daftar Film");
            System.out.println("8.  Cari Film berdasarkan ID");
            System.out.println("9.  Urutkan Data Rating Film Descending");
            System.out.println("10. Keluar");
            System.out.println("+------------------------------------------+");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    int idAwal = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan Judul Film: ");
                    String judulAwal = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingAwal = scanner.nextDouble();
                    filmList.tambahDataAwal(idAwal, judulAwal, ratingAwal);
                    System.out.println("\u001B[32mData berhasil ditambahkan di awal\u001B[0m");
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan ID Film: ");
                    int idAkhir = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Masukkan Judul Film: ");
                    String judulAkhir = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double ratingAkhir = scanner.nextDouble();
                    filmList.tambahDataAkhir(idAkhir, judulAkhir, ratingAkhir);
                    System.out.println("\u001B[32mData berhasil ditambahkan di akhir\u001B[0m");
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Masukkan ID Film: ");
                    int idIndex = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    System.out.print("Masukkan Judul Film: ");
                    String judulIndex = scanner.nextLine();

                    System.out.print("Masukkan Rating Film: ");
                    double ratingIndex = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    System.out.print("Masukkan Index: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume newline

                    filmList.tambahDataIndex(index, idIndex, judulIndex, ratingIndex);
                    System.out.println("\u001B[32mData berhasil ditambahkan pada indeks tertentu\u001B[0m");
                    System.out.println();
                    break;

                case 4:
                    filmList.hapusDataPertama();
                    System.out.println("\u001B[32mData pertama berhasil dihapus\u001B[0m");
                    System.out.println();
                    break;
                case 5:
                    filmList.hapusDataTerakhir();
                    System.out.println("\u001B[32mData terakhir berhasil dihapus\u001B[0m");
                    System.out.println();
                    break;
                case 6:
                    System.out.print("Masukkan Index: ");
                    int hapusIndex = scanner.nextInt();
                    filmList.hapusDataIndex(hapusIndex);
                    System.out.println("\u001B[32mData pada indeks tertentu berhasil dihapus\u001B[0m");
                    System.out.println();
                    break;
                case 7:
                    filmList.cetak();
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang ingin dicari: ");
                    int searchId = scanner.nextInt();
                    int nodeIndex = filmList.cariFilmById(searchId);
                    if (nodeIndex != -1) {
                        Film foundFilm = filmList.getFilmByIndex(nodeIndex);
                        System.out.println("Film dengan data ID " + searchId + " ditemukan pada node ke-" + nodeIndex + ":");
                        System.out.println("ID Film: " + searchId);
                        System.out.println("Judul Film: " + foundFilm.judul);
                        System.out.println("Rating Film: " + foundFilm.rating);
                    } else {
                        System.out.println("Film dengan ID " + searchId + " tidak ditemukan.");
                    }
                    System.out.println();
                    break;

                case 9:
                    filmList.urutkanRatingDescending();
                    System.out.println("\u001B[32mData film berhasil diurutkan berdasarkan rating secara descending:\u001B[0m");
                    filmList.cetak();
                    System.out.println();
                    break;

                case 10:
                    System.out.println("Terima kasih!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (choice != 10);

        scanner.close();
    }
}
