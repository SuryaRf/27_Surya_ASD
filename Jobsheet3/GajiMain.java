import java.util.Scanner;

public class GajiAdmin {
   public static void main(String[] args) {

        Scanner sc27 = new Scanner(System.in);
        Scanner sc27_2 = new Scanner(System.in);
        System.out.print("Masukan jumlah Data Gaji: ");
        int jumlahGaji = sc27.nextInt();
        Gaji[] gaji = new Gaji[jumlahGaji];

        for (int i = 0; i < jumlahGaji; i++) {
            gaji[i] = new Gaji();
            System.out.println("Masukkan data Gaji ke- " + (i + 1));
            System.out.print("Masukkan nama: ");
            gaji[i].nama = sc27_2.nextLine();
            System.out.print("Masukkan Gaji Pokok: ");
            sc27.next();
            gaji[i].gaji_pokok = sc27.nextLine();
            System.out.print("Masukkan Gaji Bersih: ");
            gaji[i].gaji_bersih = sc27.nextLine();
        }
        for (int i = 0; i < jumlahGaji; i++) {
            System.out.println("Data Gaji ke-" + (i + 1));
            gaji[i].cetakGaji();
        }
    }
   } 

