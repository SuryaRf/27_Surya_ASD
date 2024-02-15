import java.util.Scanner;

public class Perulangan27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Input NIM: ");
        
        String nim = scanner.next();
        System.out.println("===============================");
        // Ambil 2 digit terakhir NIM dan tambahkan 10 jika < 10
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }

        // Tampilkan nilai n
        System.out.println("Nilai n: " + n);
        System.out.println("===============================");

        // Tampilkan deretan bilangan sesuai aturan
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 1) {
                    // Angka ganjil dicetak dengan asterik
                    System.out.print("* ");
                } else {
                    // Angka genap dicetak sesuai bilangan aslinya
                    System.out.print(i + " ");
                }

                // Hindari pencetakan spasi setelah angka terakhir
                if (i < n) {
                    System.out.print(" ");
                }
            }
        }

        // Tutup scanner
        scanner.close();
    }
}
