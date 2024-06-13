package UAS;

import java.util.Comparator;
import java.util.Scanner;

public class Main27 {
    static MyLinkedList<BarangRental27> daftarBarang = new MyLinkedList<>();
    static MyLinkedList<TransaksiRental27> daftarTransaksi = new MyLinkedList<>();

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        // Isi data barang
        isiDataBarang();

        // Program utama dengan menu
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
                switch (pilihan) {
                    case 1:
                        // Menampilkan daftar kendaraan yang tersedia
                        tampilkanDaftarBarang();
                        break;
                    case 2:
                        // Input transaksi peminjaman rental
                        inputTransaksi(scanner);
                        break;
                    case 3:
                        // Menampilkan seluruh transaksi rental
                        tampilkanDaftarTransaksi();
                        break;
                    case 4:
                        // Mengurutkan transaksi berdasarkan kriteria
                        sortTransaksi();
                        break;
                    case 5:
                        // Keluar dari program
                        System.out.println("Terima kasih telah menggunakan program ini.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka sesuai dengan pilihan menu.");
                pilihan = 0; // Reset pilihan agar loop menu tetap berjalan
            }
        } while (pilihan != 5);

        scanner.close();
    }

    // Method untuk mengisi data awal barang
    private static void isiDataBarang() {
        daftarBarang.add(new BarangRental27("S 4567 YV", "Honda Beat", "Motor", 2017, 10000));
        daftarBarang.add(new BarangRental27("N 4511 VS", "Honda Vario", "Motor", 2018, 10000));
        daftarBarang.add(new BarangRental27("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000));
        daftarBarang.add(new BarangRental27("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000));
        daftarBarang.add(new BarangRental27("B 1234 AG", "Toyota Avanza", "Mobil", 2021, 25000));
    }

    // Method untuk menampilkan menu program
    private static void tampilkanMenu() {
        System.out.println(ANSI_BLUE + "\n===== Menu Program Rental Surya Kencana =====" + ANSI_RESET);
        System.out.println("+----------------------------------------------+");
        System.out.println("| No. | Menu                                   |");
        System.out.println("+----------------------------------------------+");
        System.out.println("|  1  | Tampilkan daftar kendaraan tersedia    |");
        System.out.println("|  2  | Input transaksi peminjaman rental      |");
        System.out.println("|  3  | Tampilkan seluruh transaksi rental     |");
        System.out.println("|  4  | Urutkan transaksi berdasarkan kriteria |");
        System.out.println("|  5  | Keluar                                 |");
        System.out.println("+----------------------------------------------+");
        
    }

    // Method untuk input transaksi peminjaman rental
    private static void inputTransaksi(Scanner scanner) {
        tampilkanDaftarBarang();

        System.out.print("\nMasukkan kode barang yang ingin dipinjam: ");
        String kodeBarang = scanner.nextLine();

        BarangRental27 barangDipinjam = cariBarang(kodeBarang);

        if (barangDipinjam == null) {
            System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan atau tidak tersedia.");
            return;
        }

        if (!barangDipinjam.isTersedia()) {
            System.out.println("Barang dengan kode " + kodeBarang + " sudah dipinjam orang lain.");
            return;
        }

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Apakah pelanggan adalah member (yes/no)? ");
        String memberInput = scanner.nextLine();
        boolean member = memberInput.equalsIgnoreCase("yes");

        System.out.print("Masukkan lama pinjam (dalam jam): ");
        int lamaPinjam;
        try {
            lamaPinjam = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid. Masukkan angka untuk lama pinjam.");
            return;
        }

        // Buat objek transaksi baru
        TransaksiRental27 transaksi = new TransaksiRental27(barangDipinjam, lamaPinjam, namaPelanggan, member);
        daftarTransaksi.add(transaksi);

        // Tandai barang sebagai tidak tersedia
        barangDipinjam.setTersedia(false);

        System.out.println("\nTransaksi berhasil ditambahkan:");
        System.out.println(transaksi.toString());
    }

    // Method untuk mencari barang berdasarkan kode TNKB
    private static BarangRental27 cariBarang(String kodeBarang) {
        for (int i = 0; i < daftarBarang.size(); i++) {
            BarangRental27 barang = daftarBarang.get(i);
            if (barang.getNoTNKB().equalsIgnoreCase(kodeBarang)) {
                return barang;
            }
        }
        return null;
    }

    // Method untuk menampilkan daftar barang yang tersedia
    private static void tampilkanDaftarBarang() {
        System.out.println("\n===== Daftar Barang Rental Surya Kencana =====");
        System.out.println("+--------------+----------------------+----------------------+-------+------------+");
        System.out.println("| No TNKB      | Nama Kendaraan       | Jenis Kendaraan      | Tahun | Biaya Sewa |");
        System.out.println("+--------------+----------------------+----------------------+-------+------------+");
        
        for (int i = 0; i < daftarBarang.size(); i++) {
            BarangRental27 barang = daftarBarang.get(i);
            System.out.printf("| %-12s | %-20s | %-20s | %-5d | %-10d |\n",
                              barang.getNoTNKB(), barang.getNamaKendaraan(), barang.getJenisKendaraan(),
                              barang.getTahun(), barang.getBiayaSewa());
        }
        
        System.out.println("+--------------+----------------------+----------------------+-------+------------+");
    }

    // Method untuk menampilkan seluruh transaksi rental
    private static void tampilkanDaftarTransaksi() {
        System.out.println("\n===== Seluruh Transaksi Rental =====");
        System.out.println("+--------------+----------------------+----------------------+-----------------+--------------+------------+");
        System.out.println("| Kode Trans   | No TNKB              | Nama Kendaraan       | Nama Pelanggan  | Status       | Total Bayar|");
        System.out.println("+--------------+----------------------+----------------------+-----------------+--------------+------------+");
        
        for (int i = 0; i < daftarTransaksi.size(); i++) {
            TransaksiRental27 transaksi = daftarTransaksi.get(i);
            String status = transaksi.isMember() ? "Member" : "Non-Member";
            System.out.printf("| %-12d | %-20s | %-20s | %-15s | %-12s | %-10.2f |\n",
                              transaksi.getKodeTransaksi(), transaksi.getBarang().getNoTNKB(),
                              transaksi.getBarang().getNamaKendaraan(), transaksi.getNamaPelanggan(),
                              status, transaksi.getTotalBayar());
        }
        
        System.out.println("+--------------+----------------------+----------------------+-----------------+--------------+------------+");
    }

    // Method untuk mengurutkan transaksi berdasarkan kriteria
    private static void sortTransaksi() {
        // Mengurutkan transaksi berdasarkan kriteria yang sudah disebutkan di atas
        Comparator<TransaksiRental27> comparator = Comparator.comparing((TransaksiRental27 t) -> {
            String nama = t.getBarang().getNamaKendaraan();
            char firstChar = Character.toUpperCase(nama.charAt(0));
            if (firstChar >= 'A' && firstChar <= 'M') {
                return 0;
            } else {
                return 1;
            }
        }).thenComparing(TransaksiRental27::getKodeTransaksi);

        daftarTransaksi.sort(comparator);

        System.out.println("\n===== Transaksi Rental Setelah Diurutkan =====");
        tampilkanDaftarTransaksi();
    }
}
