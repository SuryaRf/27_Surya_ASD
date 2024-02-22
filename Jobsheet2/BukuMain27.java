public class BukuMain27 {

    public static void main(String[] args) {

        Buku27 bk1 = new Buku27();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku27 bk2 = new Buku27("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku27 bukuSurya = new Buku27("Beyond the Horizon", "Surya Rahmat F", 250, 20, 70000);
        bukuSurya.terjual(10);
        bukuSurya.tampilInformasi();

        Buku27 bk3 = new Buku27("The Day After Tommorow", "Ayruz", 200, 50, 90000);
        int jumlahTerjual = 10;
        int hargaTotal = bk3.hitungHargaTotal(jumlahTerjual);
        int diskon = bk3.hitungDiskon(hargaTotal);
        int hargaBayar = bk3.hitungHargaBayar(hargaTotal, diskon);
        bk3.tampilInformasi();
        System.out.println("Harga total: Rp. " + hargaTotal);
        System.out.println("Diskon: Rp. " + diskon);
        System.out.println("Harga bayar: Rp. " + hargaBayar);
    }
}
