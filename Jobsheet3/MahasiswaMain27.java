import java.util.Scanner;

public class MahasiswaMain27 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Scanner sc27_2 = new Scanner(System.in);
        Mahasiswa27[] mahasiswa27 = new Mahasiswa27[3];

        for (int i = 0; i < mahasiswa27.length; i++) {
            mahasiswa27[i] = new Mahasiswa27();
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            mahasiswa27[i].nama = sc27_2.nextLine();
            System.out.print("Masukkan NIM: ");
            mahasiswa27[i].nim = sc27_2.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            mahasiswa27[i].JK = sc27_2.nextLine();
            System.out.print("Masukkan IPK: ");
            mahasiswa27[i].ipk = sc27.nextDouble();
            System.out.println();
        }

        for (Mahasiswa27 mhs : mahasiswa27) {
            System.out.println("Data Mahasiswa");
            System.out.println("Nama: " + mhs.nama);
            System.out.println("NIM: " + mhs.nim);
            System.out.println("Jenis Kelamin: " + mhs.JK);
            System.out.println("Nilai IPK: " + mhs.ipk);
            System.out.println();
        }

        // Memanggil method hitungRataRataIpk dan mencetak rata-rata IPK
        double rataRataIpk = mahasiswa27[0].hitungRataRataIpk(mahasiswa27);
        System.out.println("\nRata-rata IPK semua mahasiswa: " + (float)rataRataIpk);
    }
}
