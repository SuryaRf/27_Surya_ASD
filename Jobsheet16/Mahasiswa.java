package Jobsheet16;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String nomorTelepon;

    public Mahasiswa(String NIM, String nama, String nomorTelepon) {
        this.NIM = NIM;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    // Getter untuk NIM
    public String getNIM() {
        return NIM;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk nomor telepon
    public String getNomorTelepon() {
        return nomorTelepon;
    }
}


