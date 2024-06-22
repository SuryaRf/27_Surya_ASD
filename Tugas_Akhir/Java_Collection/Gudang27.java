package Tugas_Akhir.Java_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gudang27 {
        // ANSI escape codes untuk warna hijau
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_RESET = "\u001B[0m";


    private ArrayList<Barang27> daftarBarang;

    // Konstruktor dengan inisialisasi data awal
    public Gudang27(ArrayList<Barang27> dataAwal) {
        this.daftarBarang = new ArrayList<>(dataAwal);
    }

    public void tambahBarang(String kodeBarang, String namaBarang, int stok, double berat, String jenis, String satuan, double hargaBeli, double hargaJual) {
        Barang27 barangBaru = new Barang27(kodeBarang, namaBarang, stok, berat, jenis, satuan, hargaBeli, hargaJual);
        daftarBarang.add(barangBaru);
        System.out.println(ANSI_GREEN+"Barang baru telah ditambahkan: " + barangBaru +ANSI_RESET);
    }

    public void hapusBarang(String kodeBarang) {
        Barang27 barangDihapus = null;
        for (Barang27 barang : daftarBarang) {
            if (barang.getKodeBarang().equals(kodeBarang)) {
                barangDihapus = barang;
                break;
            }
        }
        if (barangDihapus != null) {
            daftarBarang.remove(barangDihapus);
            System.out.println(ANSI_GREEN+"Barang dengan kode " + kodeBarang + " telah dihapus."+ANSI_RESET);
        } else {
            System.out.println(ANSI_RED+"Barang dengan kode " + kodeBarang + " tidak ditemukan."+ANSI_RESET);
        }
    }

    public void cetakSemuaBarang() {
        System.out.println("+------------------------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s | %-15s | %-10s | %-10s | %-12s |\n", "Kode", "Nama", "Stok", "Berat (kg)", "Jenis", "Satuan", "Harga Beli", "Harga Jual");
        System.out.println("+------------------------------------------------------------------------------------------------------------------------+");
        for (Barang27 barang : daftarBarang) {
            System.out.printf("| %-10s | %-20s | %-10d | %-10.2f | %-15s | %-10s | %-10.2f | %-12f |\n",
                    barang.getKodeBarang(),
                    barang.getNamaBarang(),
                    barang.getStok(),
                    barang.getBerat(),
                    barang.getJenis(),
                    barang.getSatuan(),
                    barang.getHargaBeli(),
                    barang.getHargaJual());
        }
        System.out.println("+------------------------------------------------------------------------------------------------------------------------+");
    }

    public void sortBarangByKode() {
        Collections.sort(daftarBarang); // Menggunakan Comparable yang sudah diimplementasikan
        System.out.println(ANSI_GREEN+"Barang telah diurutkan berdasarkan Kode Barang (Ascending)." +ANSI_RESET);
        cetakSemuaBarang();
    }

    public void sortBarangByNama() {
        Collections.sort(daftarBarang, new Comparator<Barang27>() {
            @Override
            public int compare(Barang27 b1, Barang27 b2) {
                return b1.getNamaBarang().compareToIgnoreCase(b2.getNamaBarang());
            }
        });
        System.out.println(ANSI_GREEN+"Barang telah diurutkan berdasarkan Nama Barang (Ascending)."+ANSI_RESET);
        cetakSemuaBarang();
    }

    public void sortBarangByBerat() {
        Collections.sort(daftarBarang, new Comparator<Barang27>() {
            @Override
            public int compare(Barang27 b1, Barang27 b2) {
                // Sort berat secara ascending
                return Double.compare(b1.getBerat(), b2.getBerat());
            }
        });
        System.out.println(ANSI_GREEN+"Barang telah diurutkan berdasarkan Berat (Ascending)." +ANSI_RESET);
        cetakSemuaBarang();
    }

    public void searchBarangByKode(String kodeBarang) {
        for (Barang27 barang : daftarBarang) {
            if (barang.getKodeBarang().equals(kodeBarang)) {
                System.out.println(ANSI_GREEN+"Barang ditemukan: " + barang + ANSI_RESET);
                return;
            }
        }
        System.out.println(ANSI_RED+ "Barang dengan kode " + kodeBarang + " tidak ditemukan."+ANSI_RESET);
    }

    public void searchBarangByNama(String namaBarang) {
        boolean found = false;
        for (Barang27 barang : daftarBarang) {
            if (barang.getNamaBarang().equalsIgnoreCase(namaBarang)) {
                System.out.println(ANSI_GREEN+"Barang ditemukan: " + barang + ANSI_RESET);
                found = true;
            }
        }
        if (!found) {
            System.out.println(ANSI_RED+"Barang dengan nama " + namaBarang + " tidak ditemukan." + ANSI_RESET);
        }
    }
}
