package UAS;

public class BarangRental27 {
    private String noTNKB;
    private String namaKendaraan;
    private String jenisKendaraan;
    private int tahun;
    private int biayaSewa;
    private boolean tersedia;

    public BarangRental27(String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.tersedia = true; // Barang default tersedia saat pertama kali dibuat
    }

    public String getNoTNKB() {
        return noTNKB;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public int getTahun() {
        return tahun;
    }

    public int getBiayaSewa() {
        return biayaSewa;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    @Override
    public String toString() {
        return "No TNKB: " + noTNKB + ", Nama Kendaraan: " + namaKendaraan + ", Jenis: " + jenisKendaraan + ", Tahun: "
                + tahun + ", Biaya Sewa: " + biayaSewa;
    }
}
