public class Mahasiswa27 {
    String nama, JK;
    String nim;
    double ipk;
    int jmlhLength;

    public Mahasiswa27() {

    }

    public double rataRataIpk(int jumlah) {
        double jmlh = jumlah;
        double total = ipk += ipk / jmlhLength;
        return total;
    }

    public double hitungRataRataIpk(Mahasiswa27[] mahasiswas) {
        double totalIpk = 0;
        for (Mahasiswa27 mahasiswa : mahasiswas) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mahasiswas.length;
    }

}
