import java.util.Scanner;

 class NilaiAkhirMahasiswa {    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir: ");
        System.out.println("================================");
        // Input nilai tugas
        System.out.print("Masukkan nilai tugas (0-100): ");
        int nilaiTugas = input.nextInt();
        if (!isValidNilai(nilaiTugas)) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("================================");

        // Input nilai kuis
        System.out.print("Masukkan nilai kuis (0-100): ");
        int nilaiKuis = input.nextInt();
        if (!isValidNilai(nilaiKuis)) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("================================");

        // Input nilai UTS
        System.out.print("Masukkan nilai UTS (0-100): ");
        int nilaiUTS = input.nextInt();
        if (!isValidNilai(nilaiUTS)) {
            System.out.println("Nilai tidak valid");
            return;
        }
        System.out.println("================================");

        // Input nilai UAS
        System.out.print("Masukkan nilai UAS (0-100): ");
        int nilaiUAS = input.nextInt();
        if (!isValidNilai(nilaiUAS)) {
            System.out.println("================================");
            System.out.println("\u001B[31mNilai tidak valid\u001B[0m");
            return;
        }
        System.out.println("================================");

        // Hitung nilai akhir
        double nilaiAkhir = hitungNilaiAkhir(nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS);

        // Konversi nilai ke huruf
        String nilaiHuruf = konversiNilaiKeHuruf(nilaiAkhir);

        // Menentukan keterangan LULUS/TIDAK LULUS
        String keterangan = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C"))
                ? "LULUS" : "TIDAK LULUS";

        // Output hasil
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);
    }

    // Fungsi untuk memeriksa apakah nilai berada dalam rentang 0-100
    public static boolean isValidNilai(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    // Fungsi untuk menghitung nilai akhir
    public static double hitungNilaiAkhir(int nilaiTugas, int nilaiKuis, int nilaiUTS, int nilaiUAS) {
        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUTS + 0.3 * nilaiUAS;
        return nilaiAkhir;
    }

    // Fungsi untuk konversi nilai ke huruf
    public static String konversiNilaiKeHuruf(double nilaiAkhir) {
        String nilaiHuruf;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        return nilaiHuruf;
    }
}
