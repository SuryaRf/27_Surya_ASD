import java.util.Scanner;

public class StackMain27 {
    public static void main(String[] args) {
        Stack27_2 stk = new Stack27_2(5);
        Scanner sc = new Scanner(System.in);
        char pilih = ' ';
        do {
            System.out.print("Jenis: ");
            String jenis = sc.nextLine();
            System.out.print("Warna: ");
            String warna = sc.nextLine();
            System.out.print("Merk: ");
            String merk = sc.nextLine();
            System.out.print("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.print("Harga: ");
            double harga = sc.nextDouble();

            Pakaian27 p = new Pakaian27(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);
        } while (pilih == 'y');
        
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
        stk.getMax();
    }
}
// import java.util.Scanner;

// public class StackMain27 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         Stack27_2 stk = new Stack27_2(5); // Membuat objek stack dengan ukuran 5
//         char pilih;

//         do {
//             System.out.println("\nMenu:");
//             System.out.println("1. Push");
//             System.out.println("2. Pop");
//             System.out.println("3. Peek");
//             System.out.println("4. Print");
//             System.out.println("5. Keluar");
//             System.out.print("Pilih operasi yang ingin dilakukan: ");
//             int opsi = sc.nextInt();
//             sc.nextLine(); // Membersihkan newline dari buffer

//             switch (opsi) {
//                 case 1:
//                     System.out.println("Masukkan data pakaian:");
//                     System.out.print("Jenis: ");
//                     String jenis = sc.nextLine();
//                     System.out.print("Warna: ");
//                     String warna = sc.nextLine();
//                     System.out.print("Merk: ");
//                     String merk = sc.nextLine();
//                     System.out.print("Ukuran: ");
//                     String ukuran = sc.nextLine();
//                     System.out.print("Harga: ");
//                     double harga = sc.nextDouble();
//                     sc.nextLine(); // Membersihkan newline dari buffer

//                     Pakaian27 p = new Pakaian27(jenis, warna, merk, ukuran, harga);
//                     stk.push(p);
//                     break;

//                 case 2:
//                     stk.pop();
//                     break;

//                 case 3:
//                     stk.peek();
//                     break;

//                 case 4:
//                     stk.print();
//                     break;

//                 case 5:
//                     System.out.println("Keluar dari program.");
//                     return;

//                 default:
//                     System.out.println("Pilihan tidak valid.");
//                     break;
//             }

//             System.out.print("\nApakah anda ingin melanjutkan (y/n)? ");
//             pilih = sc.next().charAt(0);
//             sc.nextLine(); // Membersihkan newline dari buffer
//         } while (pilih == 'y');
        
//         sc.close();
//     }
// }
// // Modikasi nomer 4