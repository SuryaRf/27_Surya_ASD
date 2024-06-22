package Tugas_Akhir.DoubleLinked_List;

public class Mahasiswa27 {
    private String nim;
    private String nama;
    private String tglLahir;
    private String jurusan;
    private int angkatan;
    private String alamat;
    private String jenisKelamin;

    public Mahasiswa27() {}

    public Mahasiswa27(String nim, String nama, String tglLahir, String jurusan, int angkatan, String alamat, String jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.jurusan = jurusan;
        this.angkatan = angkatan;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(int angkatan) {
        this.angkatan = angkatan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama + ", Tanggal Lahir: " + tglLahir +
               ", Jurusan: " + jurusan + ", Angkatan: " + angkatan + ", Alamat: " + alamat +
               ", Jenis Kelamin: " + jenisKelamin;
    }
}
