package Jobsheet16;

public class Nilai {
    private Mahasiswa mahasiswa;
    private MataKuliah mataKuliah;
    private double nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    // Getter untuk mahasiswa
    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    

    // Getter untuk mata kuliah
    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    // Getter untuk nilai
    public double getNilai() {
        return nilai;
    }
}

