public class TransaksiBarang27 {
    private Barang27[] barangs;
    private int totalHarga;

    public TransaksiBarang27(Barang27[] barangs) {
        this.barangs = barangs;
        hitungTotalHarga();
    }

    public void tampilkanBarang() {
        System.out.println("+--------------------------------------------------------------+");
        System.out.println("| Kode   |    Nama Barang    |     Harga          |   Stok     |");
        System.out.println("+--------------------------------------------------------------+");
        for (Barang27 barang : barangs) {
            System.out.println(barang);
        }
        System.out.println("+--------------------------------------------------------------+");
    }

    public void hitungTotalHarga() {
        totalHarga = 0;
        for (Barang27 barang : barangs) {
            totalHarga += barang.getHarga();
        }
    }

    public int getTotalHarga() {
        return totalHarga;
    }
    public Barang27[] getBarangs() {
        return barangs;
    }

    public void tampilkanPembelian() {
        System.out.println("\nDaftar Barang Pembelian:");
        for (Barang27 barang : barangs) {
            System.out.println("- " + barang.getNama() + " (" + barang.getStok() + " buah)");
        }
        System.out.println("\nTotal Harga: Rp " + totalHarga);
    }

}
