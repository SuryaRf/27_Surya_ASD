package Jobsheet16;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sks;

    @Override
    public String toString() {
        return "Kode: " + kodeMK + ", Nama: " + namaMK + ", SKS: " + sks;
    }

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;

    }

    // Getter untuk kode mata kuliah
    public String getKodeMK() {
        return kodeMK;
    }

    // Getter untuk nama mata kuliah
    public String getNamaMK() {
        return namaMK;
    }

    // Getter untuk SKS
    public int getSKS() {
        return sks;
    }
}
