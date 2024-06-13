package UAS;

public class TransaksiRental27 {
    static int nextKodeTransaksi = 1;

    private int kodeTransaksi;
    private BarangRental27 barang;
    private int lamaPinjam;
    private double totalBayar;
    private String namaPelanggan;
    private boolean member;

    public TransaksiRental27(BarangRental27 barang, int lamaPinjam, String namaPelanggan, boolean member) {
        this.kodeTransaksi = nextKodeTransaksi++;
        this.barang = barang;
        this.lamaPinjam = lamaPinjam;
        this.namaPelanggan = namaPelanggan;
        this.member = member;
        hitungTotalBayar();
    }

    public int getKodeTransaksi() {
        return kodeTransaksi;
    }

    public BarangRental27 getBarang() {
        return barang;
    }

    public int getLamaPinjam() {
        return lamaPinjam;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public boolean isMember() {
        return member;
    }

    public String getNamaPelanggan(){
        return namaPelanggan;
    }

    private void hitungTotalBayar() {
        double tarifPerJam = barang.getBiayaSewa();
        double biayaSebelumDiskon = tarifPerJam * lamaPinjam;

        // Diskon berdasarkan lama peminjaman
        double diskon = 0;
        if (lamaPinjam >= 48 && lamaPinjam <= 78) {
            diskon = 0.1;
        } else if (lamaPinjam > 78) {
            diskon = 0.2;
        }

        // Potongan harga tambahan untuk member
        if (member) {
            biayaSebelumDiskon -= 25000;
        }

        double potongan = biayaSebelumDiskon * diskon;
        double biayaSetelahDiskon = biayaSebelumDiskon - potongan;

        this.totalBayar = biayaSetelahDiskon;
    }

    @Override
    public String toString() {
        String memberStatus = member ? "Member" : "Non-Member";
        return "Kode Transaksi: " + kodeTransaksi + ", " + barang.toString() + ", Lama Pinjam: " + lamaPinjam
                + " jam, Nama Pelanggan: " + namaPelanggan + ", Status: " + memberStatus + ", Total Bayar: "
                + totalBayar;
    }
}
