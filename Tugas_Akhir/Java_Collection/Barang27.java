package Tugas_Akhir.Java_Collection;

public class Barang27 implements Comparable<Barang27> {
    private String kodeBarang;
    private String namaBarang;
    private int stok;
    private double berat;
    private String jenis;
    private String satuan;
    private double hargaBeli;
    private double hargaJual;

    public Barang27(String kodeBarang, String namaBarang, int stok, double berat, String jenis, String satuan, double hargaBeli, double hargaJual) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.berat = berat;
        this.jenis = jenis;
        this.satuan = satuan;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(double hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public double getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(double hargaJual) {
        this.hargaJual = hargaJual;
    }

    @Override
    public String toString() {
        return "Kode Barang: " + kodeBarang +
                ", Nama Barang: " + namaBarang +
                ", Stok: " + stok +
                ", Berat: " + berat +
                ", Jenis: " + jenis +
                ", Satuan: " + satuan +
                ", Harga Beli: " + hargaBeli +
                ", Harga Jual: " + hargaJual;
    }

    @Override
    public int compareTo(Barang27 other) {
        // Implementasi compareTo untuk sorting berdasarkan kodeBarang secara ascending
        return this.kodeBarang.compareTo(other.kodeBarang);
    }
}
