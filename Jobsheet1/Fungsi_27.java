import java.util.Scanner;

 class Fungsi_27 {

    private static final int[][] STOCK = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    private static final int[] HARGA = {75000, 50000, 60000, 10000};

    private static final String[] CABANG = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pendapatan setiap cabang
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < CABANG.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < STOCK[i].length; j++) {
                pendapatan += STOCK[i][j] * HARGA[j];
            }
            System.out.println(CABANG[i] + ": Rp" + pendapatan);
        }

        // Menampilkan jumlah stok setiap jenis bunga pada cabang RoyalGarden
        System.out.println("\nJumlah stok setiap jenis bunga pada cabang RoyalGarden:");
        for (int i = 0; i < HARGA.length; i++) {
            int totalStok = 0;
            for (int j = 0; j < STOCK.length; j++) {
                totalStok += STOCK[j][i];
            }
            System.out.println(getJenisBunga(i) + ": " + totalStok);
        }

        // Mengurangi stok bunga berdasarkan inputan user
        System.out.println("\nPengurangan stok bunga:");
        for (int i = 0; i < HARGA.length; i++) {
            System.out.print("Masukkan pengurangan stok " + getJenisBunga(i) + ": ");
            int pengurangan = scanner.nextInt();
            for (int j = 0; j < STOCK.length; j++) {
                if (STOCK[j][i] >= pengurangan) {
                    STOCK[j][i] -= pengurangan;
                    break;
                }
            }
        }

        // Menampilkan sisa stok setelah pengurangan
        System.out.println("\nSisa stok setelah pengurangan:");
        for (int i = 0; i < HARGA.length; i++) {
            int totalStok = 0;
            for (int j = 0; j < STOCK.length; j++) {
                totalStok += STOCK[j][i];
            }
            System.out.println(getJenisBunga(i) + ": " + totalStok);
        }
    }

    private static String getJenisBunga(int i) {
        switch (i) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
