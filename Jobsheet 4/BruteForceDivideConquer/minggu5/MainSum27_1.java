package BruteForceDivideConquer.minggu5;
import java.util.Scanner;
public class MainSum27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        sc.nextLine(); // Membuang karakter newline

        Perusahaan[] perusahaan = new Perusahaan[jumlahPerusahaan];

        // Input data keuntungan bulanan untuk setiap perusahaan
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan nama perusahaan ke-" + (i + 1) + ": ");
            sc.next();  // Membuang karakter newline
           
            String namaPerusahaan = sc.nextLine();

            System.out.print("Masukkan jumlah bulan untuk perusahaan " + namaPerusahaan + ": ");
            int jumlahBulan = sc27.nextInt();

            perusahaan[i] = new Perusahaan(namaPerusahaan, jumlahBulan);

            System.out.println("Masukkan keuntungan bulanan untuk perusahaan " + namaPerusahaan + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("  Bulan ke-" + (j + 1) + ": ");
                double keuntungan = sc.nextDouble();
                perusahaan[i].setKeuntunganBulanan(j + 1, keuntungan);
            }
        }

        // Menampilkan total keuntungan untuk setiap perusahaan
        for (Perusahaan p : perusahaan) {
            System.out.println("Total keuntungan " + p.getTotalKeuntunganFormatted() + " juta untuk " + p.getNamaPerusahaan());
        }

        sc.close();
    }
}
