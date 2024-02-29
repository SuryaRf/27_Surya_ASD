import java.util.Scanner;

public class AdminMain {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        Scanner sc27_2 = new Scanner(System.in);
        System.out.print("Masukan jumlah admin: ");
        int jumlahAdm = sc27.nextInt();
        Admin[] admin = new Admin[2];

        for (int i = 0; i < jumlahAdm; i++) {
            admin[i] = new Admin();
            System.out.println("Masukkan data Admin ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            admin[i].nama = sc27_2.nextLine();
            System.out.print("Masukkan Username: ");
            sc27.next();
            admin[i].username = sc27.nextLine();
            System.out.print("Masukkan Password: ");
            admin[i].password = sc27.nextLine();
            System.out.print("Masukkan Email: ");
            admin[i].email = sc27.nextLine();
            System.out.print("Masukkan Alamat: ");
            admin[i].alamat = sc27.nextLine();
            System.out.print("Masukkan Nomor Telepon: ");
            admin[i].nomer_telepon = sc27.nextLine();
            System.out.println();
        }
        for (int i = 0; i < jumlahAdm; i++) {
            System.out.println("Data Admin ke-" + (i + 1));
            admin[i].cetakInfo();
        }
    }
}



