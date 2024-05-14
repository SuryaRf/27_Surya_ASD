package Jobsheet12.DoubleLinkedList;

public class AntrianVaksinasiMain {
    public static void main(String[] args) {
        Queue27 antrianVaksinasi = new Queue27();
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\u001B[33m+------------------------------------------+");
            System.out.println("|        PENGANTRI VAKSIN EXTRAVAGANZA     |");
            System.out.println("+------------------------------------------+\u001B[0m");
            
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.println("+------------------------------------------+");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nomor antrian: ");
                    int nomorAntrian = input.nextInt();
                    input.nextLine(); // consume newline
                    System.out.print("Masukkan nama penerima vaksin: ");
                    String nama = input.nextLine();
                    antrianVaksinasi.enqueue(nomorAntrian, nama);
                    System.out.println("\u001B[32mData penerima vaksin telah ditambahkan ke dalam antrian.\u001B[0m");
                    System.out.println();
                    break;

                case 2:
                    antrianVaksinasi.dequeue();
                    System.out.println();

                case 3:
                    System.out.println("Daftar penerima vaksin:");
                    antrianVaksinasi.display();
                    System.out.println("Sisa Antrian: " + antrianVaksinasi.getSize());
                    System.out.println();
                    break;
                case 4:
                System.out.println("\u001B[32mTerima kasih!\u001B[0m");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid, silakan pilih menu yang sesuai.");
            }
        }
    }
}
