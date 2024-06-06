package Jobsheet16;

// public class Mahasiswa {
//     String nim;
//     String nama;
//     String noteIp;

//     public Mahasiswa(){

//     }

//     public Mahasiswa(String nim, String nama, String noteIp){
//         this.nim = nim;
//         this.nama = nama;
//         this.noteIp = noteIp;
//     }
//     @Override
//     public String toString(){
//         return "Mahasiswa{"+ "nim= " + nim + "nama= " + nama + "noteIp= " + noteIp + '}';
//     }
// }


public class Mahasiswa1 implements Comparable<Mahasiswa1> {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa1(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    @Override
    public int compareTo(Mahasiswa1 other) {
        return this.nim.compareTo(other.nim);
    }

    // Metode toString() dan lain-lain

    @Override
public String toString() {
    return String.format("Mahasiswa {NIM: %s, Nama: %s, Kelas: %s}", nim, nama, kelas);
}

}
