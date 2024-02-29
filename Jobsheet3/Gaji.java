public class Gaji {
    String nama;
    String gaji_pokok, gaji_bersih;

    public Gaji() {

    }

    public Gaji(String nm, String gj_pkk,String gj_bersih) {
        nama = nm;
        gaji_pokok = gj_pkk;
        gaji_bersih = gj_bersih;
       

    }
    public void cetakGaji() {
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gaji_pokok + " Gaji Bersih: " + gaji_bersih);
    }
}
