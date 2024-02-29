import java.util.Scanner;

public class KaryawanMain {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Scanner sc27_2 = new Scanner(System.in);
        System.out.print("Masukan jumlah karyawan: ");
        int jumlahKar = sc27.nextInt();
        Karyawan[] karyawan = new Karyawan[jumlahKar];

        for (int i = 0; i < jumlahKar; i++) {
            karyawan[i] = new Karyawan();
            System.out.println("Masukkan data karyawan ke- " + (i + 1));
            System.out.print("Masukkan nama: ");

            karyawan[i].nama = sc27_2.nextLine();
            System.out.print("Masukkan Username: ");
            sc27.next();
            karyawan[i].username = sc27.nextLine();
            System.out.print("Masukkan Password: ");
            karyawan[i].password = sc27.nextLine();
            System.out.print("Masukkan Email: ");
            karyawan[i].email = sc27.nextLine();
            System.out.print("Masukkan Alamat: ");
            karyawan[i].alamat = sc27.nextLine();
            System.out.print("Masukkan Nomor Telepon: ");
            karyawan[i].nomer_telepon = sc27.nextLine();
            System.out.print("Masukkan Gaji: ");
            karyawan[i].email = sc27.nextLine();
            System.out.print("Masukkan Jabatan: ");
            karyawan[i].alamat = sc27.nextLine();
            System.out.print("Masukkan Jenis Kelamin: ");
            karyawan[i].jenis_Kelamin = sc27.nextLine();
            System.out.println();
        }
        for (int i = 0; i < jumlahKar; i++) {
            System.out.println("Data karyawan ke-" + (i + 1));
            karyawan[i].cetakInfo();
        }
    }
}
