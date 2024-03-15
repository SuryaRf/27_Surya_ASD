// package BruteForceDivideConquer.minggu5;

// import java.util.Scanner;



//     public class MainFaktorial27 {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             System.out.println("===================================================");
//             System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
//             int elemen = sc.nextInt();

//             Faktorial27[] fk = new Faktorial27[elemen];
//             for (int i = 0; i < elemen; i++) {
//                 fk[i] = new Faktorial27();
//                 System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
//                 fk[i].nilai = sc.nextInt();
//             }

//             System.out.println("===================================================");
//             System.out.println("Hasil Faktorial dengan Brute Force");
//             for (int i = 0; i < elemen; i++) {
//                 System.out
//                         .println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
//             }
//             System.out.println("===================================================");
//             System.out.println("Hasil Faktorial dengan Divide and Conquer");
//             for (int i = 0; i < elemen; i++) {
//                 System.out
//                         .println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
//             }
//         }
//     }
// MODIF 1


// package BruteForceDivideConquer.minggu5;

// import java.util.Date;
// import java.util.Scanner;

// public class MainFaktorial27 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("===================================================");
//         System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
//         int elemen = sc.nextInt();

//         Faktorial27[] fk = new Faktorial27[elemen];
//         for (int i = 0; i < elemen; i++) {
//             fk[i] = new Faktorial27();
//             System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
//             fk[i].nilai = sc.nextInt();
//         }

//         System.out.println("===================================================");
//         System.out.println("Hasil Faktorial dengan Brute Force");
//         for (int i = 0; i < elemen; i++) {
//             Date startTimeBF = new Date();
//             int hasilBF = fk[i].faktorialBF(fk[i].nilai);
//             Date endTimeBF = new Date();
//             long waktuEksekusiBF = endTimeBF.getTime() - startTimeBF.getTime();
//             System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilBF + " (Waktu eksekusi: " + waktuEksekusiBF + " ms)");
//         }

//         System.out.println("===================================================");
//         System.out.println("Hasil Faktorial dengan Divide and Conquer");
//         for (int i = 0; i < elemen; i++) {
//             Date startTimeDC = new Date();
//             int hasilDC = fk[i].faktorialDC(fk[i].nilai);
//             Date endTimeDC = new Date();
//             long waktuEksekusiDC = endTimeDC.getTime() - startTimeDC.getTime();
//             System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilDC + " (Waktu eksekusi: " + waktuEksekusiDC + " ms)");
//         }
//     }
// }

//MODIF 2


// package BruteForceDivideConquer.minggu5;

// import java.util.Date;
// import java.util.Scanner;

// public class MainFaktorial27 {

//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("===================================================");
//     System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
//     int elemen = sc.nextInt();

//     Faktorial27[] fk = new Faktorial27[elemen];
//     for (int i = 0; i < elemen; i++) {
//       System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
//       int nilai = sc.nextInt();
//       fk[i] = new Faktorial27(nilai);
//     }

//     System.out.println("===================================================");
//     System.out.println("Hasil Faktorial dengan Brute Force");
//     for (int i = 0; i < elemen; i++) {
//       Date startTimeBF = new Date();
//       int hasilBF = fk[i].faktorialBF();
//       Date endTimeBF = new Date();
//       long waktuEksekusiBF = endTimeBF.getTime() - startTimeBF.getTime();
//       System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilBF + " (Waktu eksekusi: " + waktuEksekusiBF + " ms)");
//     }

//     System.out.println("===================================================");
//     System.out.println("Hasil Faktorial dengan Divide and Conquer");
//     for (int i = 0; i < elemen; i++) {
//       Date startTimeDC = new Date();
//       int hasilDC = fk[i].faktorialDC();
//       Date endTimeDC = new Date();
//       long waktuEksekusiDC = endTimeDC.getTime() - startTimeDC.getTime();
//       System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilDC + " (Waktu eksekusi: " + waktuEksekusiDC + " ms)");
//     }
//   }
// } 
//MODIF 3

package BruteForceDivideConquer.minggu5;

import java.util.Date;
import java.util.Scanner;

public class MainFaktorial27 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("===================================================");

    // Menampilkan menu
    System.out.println("Pilih metode perhitungan faktorial:");
    System.out.println("1. Brute Force");
    System.out.println("2. Divide and Conquer");
    System.out.print("Masukkan pilihan Anda (1/2): ");
    int pilihan = sc.nextInt();

    // Membaca jumlah elemen
    System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
    int elemen = sc.nextInt();

    Faktorial27[] fk = new Faktorial27[elemen];
    for (int i = 0; i < elemen; i++) {
      System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
      int nilai = sc.nextInt();
      fk[i] = new Faktorial27(nilai);
    }

    // Menjalankan metode yang dipilih
    if (pilihan == 1) {
      System.out.println("===================================================");
      System.out.println("Hasil Faktorial dengan Brute Force");
      for (int i = 0; i < elemen; i++) {
        Date startTimeBF = new Date();
        int hasilBF = fk[i].faktorialBF();
        Date endTimeBF = new Date();
        long waktuEksekusiBF = endTimeBF.getTime() - startTimeBF.getTime();
        System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilBF + " (Waktu eksekusi: " + waktuEksekusiBF + " ms)");
      }
    } else if (pilihan == 2) {
      System.out.println("===================================================");
      System.out.println("Hasil Faktorial dengan Divide and Conquer");
      for (int i = 0; i < elemen; i++) {
        Date startTimeDC = new Date();
        int hasilDC = fk[i].faktorialDC();
        Date endTimeDC = new Date();
        long waktuEksekusiDC = endTimeDC.getTime() - startTimeDC.getTime();
        System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilDC + " (Waktu eksekusi: " + waktuEksekusiDC + " ms)");
      }
    } else {
      System.out.println("Pilihan tidak valid!");
    }
  }
}
//MODIF 4