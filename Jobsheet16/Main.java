

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         // Buat objek Program
//         Program program = new Program();
//         // Buat objek Scanner untuk input pengguna
//         Scanner scanner = new Scanner(System.in);

//         // Isikan data mahasiswa
//         program.tambahMahasiswa(new Mahasiswa("20001", "Thalhah", "021xxx"));
//         program.tambahMahasiswa(new Mahasiswa("20002", "Zubair", "021xxx"));
//         program.tambahMahasiswa(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
//         program.tambahMahasiswa(new Mahasiswa("20004", "Sa'ad", "021xxx"));
//         program.tambahMahasiswa(new Mahasiswa("20005", "Sa'id", "021xxx"));
//         program.tambahMahasiswa(new Mahasiswa("20006", "Ubaidah", "021xxx"));

//         // Isikan data mata kuliah
//         program.tambahMataKuliah(new MataKuliah("00001", "Internet Of Things", 3));
//         program.tambahMataKuliah(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
//         program.tambahMataKuliah(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
//         program.tambahMataKuliah(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
//         program.tambahMataKuliah(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

//         int choice;
//         do {
//             System.out.println();
//             System.out.println("\u001B[33m***************************************************");
//             System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
//             System.out.println("***************************************************\u001B[0m");

//             System.out.println("Menu:");
//             System.out.println("+------------------------------------+");
//             System.out.println("| Pilihan |          Deskripsi       |");
//             System.out.println("+------------------------------------+");
//             System.out.println("|    1    |Input Nilai               |");
//             System.out.println("|    2    |Tampilkan Nilai           |");
//             System.out.println("|    3    |Cari Nilai Mahasiswa NIM  |");
//             System.out.println("|    4    |Urutkan Data Mahasiswa    |");
//             System.out.println("|    5    |Keluar                    |");
//             System.out.println("+------------------------------------+");
//             System.out.print("Pilih menu: ");

//             choice = scanner.nextInt();
//             scanner.nextLine(); // Membersihkan newline dari buffer

//             switch (choice) {
//                 case 1:
//                     // Input nilai
//                     inputNilai(scanner, program);
//                     break;
//                 case 2:
//                     // Tampilkan nilai semua mahasiswa
//                     System.out.println("\nDaftar Nilai Mahasiswa:");
//                     program.tampilNilai();
//                     break;
//                 case 3:
//                     // Cari nilai mahasiswa berdasarkan NIM
//                     System.out.print("Masukkan NIM Mahasiswa: ");
//                     String nim = scanner.nextLine();
//                     program.cariNilaiMahasiswa(nim);
//                     break;
//                 case 4:
//                     // Urutkan data mahasiswa dari nilai terkecil ke terbesar
//                     program.urutkanNilaiAscending();
//                     System.out.println("\nDaftar Nilai Mahasiswa (Terurut dari Nilai Terkecil ke Terbesar):");
//                     program.tampilNilai();
//                     break;
//                 case 5:
//                     // Keluar dari program
//                     System.out.println("\u001B[32mTerima kasih!\u001B[0m");
//                     break;
//                 default:
//                     System.out.println("\u001B[31mPilihan tidak valid.\u001B[0m");
//             }
//         } while (choice != 5);

//         // Tutup scanner
//         scanner.close();
//     }

//     public static void inputNilai(Scanner scanner, Program program) {
//         // Menampilkan data mahasiswa
//         program.tampilkanDaftarMahasiswa();

//         // Menampilkan data mata kuliah
//         System.out.println("\n\u001B[33mData Mata Kuliah:\u001B[0m");
//         System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");
//         System.out.println("\u001B[33m| Kode   | Mata Kuliah                                | SKS |\u001B[0m");
//         System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");
//         System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00001", "Internet Of Things", 3);
//         System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00002", "Algoritma dan Struktur Data", 2);
//         System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00003", "Algoritma dan Pemrograman", 2);
//         System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00004", "Praktikum Algoritma dan Struktur Data", 3);
//         System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00005", "Praktikum Algoritma dan Pemrograman", 3);
//         System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");
        
        

//         // Meminta input NIM mahasiswa
//         System.out.print("\nMasukkan NIM mahasiswa yang akan dimasukkan nilai: ");
//         String nim = scanner.nextLine();

//         // Meminta input kode mata kuliah
//         System.out.print("Pilih kode mata kuliah: ");
//         String kodeMK = scanner.nextLine();

//         // Meminta input nilai
//         System.out.print("Masukkan nilai: ");
//         double nilai = scanner.nextDouble();
//         scanner.nextLine(); // Membersihkan newline dari buffer

//         // Memasukkan nilai ke dalam program
//         program.inputNilai(nim, kodeMK, nilai);
//     }
// }
package Jobsheet16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat objek Program
        Program program = new Program();
        // Buat objek Scanner untuk input pengguna
        Scanner scanner = new Scanner(System.in);

        // Isikan data mahasiswa
        program.tambahMahasiswa(new Mahasiswa("20001", "Thalhah", "021xxx"));
        program.tambahMahasiswa(new Mahasiswa("20002", "Zubair", "021xxx"));
        program.tambahMahasiswa(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        program.tambahMahasiswa(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        program.tambahMahasiswa(new Mahasiswa("20005", "Sa'id", "021xxx"));
        program.tambahMahasiswa(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        // Isikan data mata kuliah
        program.tambahMataKuliah(new MataKuliah("00001", "Internet Of Things", 3));
        program.tambahMataKuliah(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        program.tambahMataKuliah(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        program.tambahMataKuliah(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        program.tambahMataKuliah(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int choice;
        do {
            System.out.println();
            System.out.println("\u001B[33m***************************************************");
            System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***************************************************\u001B[0m");

            System.out.println("Menu:");
            System.out.println("+------------------------------------+");
            System.out.println("| Pilihan |          Deskripsi       |");
            System.out.println("+------------------------------------+");
            System.out.println("|    1    |Input Nilai               |");
            System.out.println("|    2    |Tampilkan Nilai           |");
            System.out.println("|    3    |Cari Nilai Mahasiswa NIM  |");
            System.out.println("|    4    |Urutkan Data Mahasiswa    |");
            System.out.println("|    5    |Hapus Mahasiswa           |");
            System.out.println("|    6    |Keluar                    |");
            System.out.println("+------------------------------------+");
            System.out.print("Pilih menu: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer

            switch (choice) {
                case 1:
                    // Input nilai
                    inputNilai(scanner, program);
                    break;
                case 2:
                    // Tampilkan nilai semua mahasiswa
                    System.out.println("\nDaftar Nilai Mahasiswa:");
                    program.tampilNilai();
                    break;
                case 3:
                    // Cari nilai mahasiswa berdasarkan NIM
                    System.out.print("Masukkan NIM Mahasiswa: ");
                    String nim = scanner.nextLine();
                    program.cariNilaiMahasiswa(nim);
                    break;
                case 4:
                    // Urutkan data mahasiswa dari nilai terkecil ke terbesar
                    program.urutkanNilaiAscending();
                    System.out.println("\nDaftar Nilai Mahasiswa (Terurut dari Nilai Terkecil ke Terbesar):");
                    program.tampilNilai();
                    break;
                case 5:
                    // Hapus mahasiswa
                    program.hapusMahasiswa();
                    break;
                case 6:
                    // Keluar dari program
                    System.out.println("\u001B[32mTerima kasih!\u001B[0m");
                    break;
                default:
                    System.out.println("\u001B[31mPilihan tidak valid.\u001B[0m");
            }
        } while (choice != 6);

        // Tutup scanner
        scanner.close();
    }

    public static void inputNilai(Scanner scanner, Program program) {
        // Menampilkan data mahasiswa
        program.tampilkanDaftarMahasiswa();

        // Menampilkan data mata kuliah
        System.out.println("\n\u001B[33mData Mata Kuliah:\u001B[0m");
        System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");
        System.out.println("\u001B[33m| Kode   | Mata Kuliah                                | SKS |\u001B[0m");
        System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");
        System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00001", "Internet Of Things", 3);
        System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00002", "Algoritma dan Struktur Data", 2);
        System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00003", "Algoritma dan Pemrograman", 2);
        System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00004", "Praktikum Algoritma dan Struktur Data", 3);
        System.out.printf("\u001B[33m| %-6s | %-42s | %-3d |\u001B[0m\n", "00005", "Praktikum Algoritma dan Pemrograman", 3);
        System.out.println("\u001B[33m+--------+--------------------------------------------+-----+\u001B[0m");

        // Meminta input NIM mahasiswa
        System.out.print("\nMasukkan NIM mahasiswa yang akan dimasukkan nilai: ");
        String nim = scanner.nextLine();

        // Meminta input kode mata kuliah
        System.out.print("Pilih kode mata kuliah: ");
        String kodeMK = scanner.nextLine();

        // Meminta input nilai
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan newline dari buffer

        // Memasukkan nilai ke dalam program
        program.inputNilai(nim, kodeMK, nilai);
    }
}
