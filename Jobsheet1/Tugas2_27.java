import java.util.Scanner;

public class Tugas2_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=========MENU===========");
            System.out.println("a. Menghitung Kecepatan");
            System.out.println("b. Menghitung Jarak");
            System.out.println("c. Menghitung Waktu");
            System.out.println("d. Keluar");
            System.out.print("Pilih menu (a/b/c/d): ");

            char menu = scanner.next().charAt(0);

            switch (menu) {
                case 'a':
                    hitungKecepatan();
                    break;
                case 'b':
                    hitungJarak();
                    break;
                case 'c':
                    hitungWaktu();
                    break;
                case 'd':
                    System.out.println("Program selesai. Terima kasih!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih lagi.");
            }
        }
    }

    static void hitungKecepatan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = scanner.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Hasil Perhitungan Kecepatan (v): " + kecepatan + " m/s");
        System.out.println("===================================");
        System.out.println("");
    }

    static void hitungJarak() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = scanner.nextDouble();
        System.out.print("Masukkan Waktu (t): ");
        double waktu = scanner.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Hasil Perhitungan Jarak (s): " + jarak + " meter");
        System.out.println("===================================");
        System.out.println("");
    }

    static void hitungWaktu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Jarak (s): ");
        double jarak = scanner.nextDouble();
        System.out.print("Masukkan Kecepatan (v): ");
        double kecepatan = scanner.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Hasil Perhitungan Waktu (t): " + waktu + " detik");
        System.out.println("===================================");
        System.out.println("");
    }
}

