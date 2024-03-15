package BruteForceDivideConquer.minggu5;

import java.text.DecimalFormat;


class Perusahaan {
    private String namaPerusahaan;
    private double[] keuntunganBulanan;

    public Perusahaan(String namaPerusahaan, int jumlahBulan) {
        this.namaPerusahaan = namaPerusahaan;
        this.keuntunganBulanan = new double[jumlahBulan];
    }

    public void setKeuntunganBulanan(int bulan, double keuntungan) {
        this.keuntunganBulanan[bulan - 1] = keuntungan;
    }

    public double hitungTotalKeuntungan() {
        double total = 0;
        for (double keuntungan : keuntunganBulanan) {
            total += keuntungan;
        }
        return total;
    }

    public String getTotalKeuntunganFormatted() {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(hitungTotalKeuntungan());
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

