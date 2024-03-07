import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBarang27 {
     
    private static List<Barang27> daftarBarangDibeli = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            
        Barang27[] barangs = {
            new Barang27("B001", "Sabun Mandi", 10000, 100),
            new Barang27("B002", "Pasta Gigi", 15000, 80),
            new Barang27("B003", "Shampoo", 20000, 50),
            new Barang27("B004", "Deterjen", 25000, 70),
            new Barang27("B005", "Pewangi Pakaian", 30000, 60),
        };

        TransaksiBarang27 transaksiBarang = new TransaksiBarang27(barangs);

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    lakukanPembelian(transaksiBarang);
                    break;
                case 3:
               
                    tampilkanDaftarBarangDibeli();
                    break;
                case 4:
                    System.out.println("Terima kasih telah berbelanja!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }

    private static void tampilkanMenu() {
        System.out.println("=========================================");
        System.out.println("             **TOKO ZURYAAA**            ");
        System.out.println("=========================================");
        System.out.println("1. Tampilkan Barang");
        System.out.println("2. Lakukan Pembelian");
        System.out.println("3. Tampilkan Daftar Pembelian");
        System.out.println("4. Keluar");
        System.out.print("Pilihan Anda (1-4): ");
    }

    private static void lakukanPembelian(TransaksiBarang27 transaksiBarang) {
        Scanner scanner = new Scanner(System.in);
        boolean selesai = false;
      
        while (!selesai) {
          System.out.print("\nMasukkan kode barang untuk membeli (ketik 'selesai' untuk selesai): ");
          String kodeBarang = scanner.nextLine();
      
          if (kodeBarang.equalsIgnoreCase("selesai")) {
            selesai = true;
          } else {
            Barang27 barangDitemukan = null;
            for (Barang27 barang : transaksiBarang.getBarangs()) {
              if (barang.getKode().equalsIgnoreCase(kodeBarang)) {
                barangDitemukan = barang;
                break;
              }
            }
      
            if (barangDitemukan != null) {
              System.out.println("Anda membeli barang " + barangDitemukan.getNama());
              daftarBarangDibeli.add(barangDitemukan);
              // Kurangi stok barang
              barangDitemukan.setStok(barangDitemukan.getStok() - 1);
              // Update total harga (jika perlu)
              // transaksiBarang.hitungTotalHarga(); // Optional, tergantung logika bisnis
      
              // Tampilkan detail barang yang dibeli
              tampilkanDetailBarang(barangDitemukan);
            } else {
              System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan!");
            }
          }
        }
      
        // Tampilkan daftar barang yang sudah dibeli
        System.out.println("\nDaftar Barang yang Sudah Dibeli:");
        for (Barang27 barang : transaksiBarang.getBarangs()) {
          if (barang.getStok() < barang.getStokAwal()) {
            System.out.println("- " + barang.getNama() + " (" + (barang.getStokAwal() - barang.getStok()) + " buah)");
          }
        }
      }
    public static void tampilkanDetailBarang(Barang27 barang) {
        System.out.println("\nBarang yang dibeli:");
        System.out.println("Kode Barang: " + barang.getKode());
        System.out.println("Nama Barang: " + barang.getNama());
        System.out.println("Harga: Rp " + barang.getHarga());
        System.out.println("Stok: " + barang.getStok());
    }
    static void tampilkanDaftarBarangDibeli() {
        System.out.println("\nDaftar Barang yang Dibeli:");
        for (Barang27 barang : daftarBarangDibeli) {
          System.out.println("- " + barang.getNama() + " (" + barang.getStokAwal() + " - " + barang.getStok() + " = " + (barang.getStokAwal() - barang.getStok()) + " buah)");
        }
      }
    

}
