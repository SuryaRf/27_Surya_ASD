// package Jobsheet16;

//Kode nomer 1 Non Modif
// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.stream.Collectors;

// public class Program {
//     private List<Nilai> daftarNilai = new ArrayList<>();
//     private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
//     private List<MataKuliah> daftarMataKuliah = new ArrayList<>();

//     // Input data nilai untuk mahasiswa dan mata kuliah tertentu
//     public void inputNilai(String nim, String kodeMK, double nilai) {
//         Mahasiswa mahasiswa = cariMahasiswa(nim);
//         MataKuliah mataKuliah = cariMataKuliah(kodeMK);

//         if (mahasiswa != null && mataKuliah != null) {
//             Nilai nilaiMahasiswa = new Nilai(mahasiswa, mataKuliah, nilai);
//             daftarNilai.add(nilaiMahasiswa);
//             System.out.println("Nilai berhasil dimasukkan untuk Mahasiswa dengan NIM " + nim +
//                     " pada Mata Kuliah dengan kode " + kodeMK);
//         } else {
//             System.out.println("Mahasiswa dengan NIM " + nim + " atau Mata Kuliah dengan kode " + kodeMK +
//                     " tidak ditemukan.");
//         }
//     }

//     public void tambahMahasiswa(Mahasiswa mahasiswa) {
//         daftarMahasiswa.add(mahasiswa);
//     }

//     // Metode untuk menambahkan mata kuliah ke dalam daftar
//     public void tambahMataKuliah(MataKuliah mataKuliah) {
//         daftarMataKuliah.add(mataKuliah);
//     }

//     public void tampilkanDaftarMahasiswa() {
//         if (daftarMahasiswa.isEmpty()) {
//             System.out.println("Daftar mahasiswa kosong.");
//         } else {
//             System.out.println("\u001B[32m+---------------------+");
//             System.out.println("|   Daftar Mahasiswa  |");
//             System.out.println("+---------------------+\u001B[0m");

//             for (Mahasiswa mahasiswa : daftarMahasiswa) {
//                 System.out.println("\u001B[32m+-------------------------------------------------------+\u001B[0m");
//                 System.out.println("\u001B[32m| NIM: " + mahasiswa.getNIM() + "\t\t\t\t\t\t|");
//                 System.out.println("\u001B[32m| Nama: " + mahasiswa.getNama() + "\t\t\t\t\t\t|");
//                 System.out.println("\u001B[32m| Nomor Telepon: " + mahasiswa.getNomorTelepon() + "\t\t\t\t\t|");
//                 System.out.println("\u001B[32m+-------------------------------------------------------+\u001B[0m");
//             }

//         }
//     }

//     // Tampilkan nilai semua mahasiswa
//     // Tampilkan nilai semua mahasiswa
//     // Tampilkan nilai semua mahasiswa
//     public void tampilNilai() {
//         System.out.println(
//                 "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
//         System.out.println(
//                 "| NIM             |         Nama         |    Nomor Telepon     |                        Mata Kuliah                       |   SKS     | Nilai |");
//         System.out.println(
//                 "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
//         for (Nilai nilai : daftarNilai) {
//             String nim = nilai.getMahasiswa().getNIM();
//             String nama = nilai.getMahasiswa().getNama();
//             String nomorTelepon = nilai.getMahasiswa().getNomorTelepon();
//             String kodeMK = nilai.getMataKuliah().getKodeMK();
//             String namaMK = nilai.getMataKuliah().getNamaMK();
//             int sks = nilai.getMataKuliah().getSKS();
//             double nilaiMahasiswa = nilai.getNilai();

//             System.out.printf("| %-16s| %-21s| %-21s| %-57s| %-10s| %-5.1f |\n", nim, nama, nomorTelepon,
//                     kodeMK + " - " + namaMK, sks, nilaiMahasiswa);
//         }
//         System.out.println(
//                 "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
//     }

//     // Cari nilai mahasiswa berdasarkan NIM
//     public void cariNilaiMahasiswa(String nim) {
//         List<Nilai> nilaiMahasiswa = daftarNilai.stream()
//                 .filter(nilai -> nilai.getMahasiswa().getNIM().equals(nim))
//                 .collect(Collectors.toList());

//         if (!nilaiMahasiswa.isEmpty()) {
//             System.out.println();
//             System.out.println("Nilai Mahasiswa dengan NIM " + nim + ":");
//             for (Nilai nilai : nilaiMahasiswa) {
//                 System.out.println("Mata Kuliah:\n " + nilai.getMataKuliah() +
//                         ", Nilai: " + nilai.getNilai());
//             }
//         } else {
//             System.out.println();
//             System.out.println("Nilai Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
//         }
//     }

//     // Urutkan data mahasiswa dari nilai terkecil ke terbesar
//     public void urutkanNilaiAscending() {
//         daftarNilai.sort(Comparator.comparingDouble(Nilai::getNilai));
//     }

//     // Metode untuk mencari mahasiswa berdasarkan NIM
//     private Mahasiswa cariMahasiswa(String nim) {
//         for (Mahasiswa mahasiswa : daftarMahasiswa) {
//             if (mahasiswa.getNIM().equals(nim)) {
//                 return mahasiswa;
//             }
//         }
//         return null;
//     }

//     // Metode untuk mencari mata kuliah berdasarkan kode
//     private MataKuliah cariMataKuliah(String kodeMK) {
//         for (MataKuliah mataKuliah : daftarMataKuliah) {
//             if (mataKuliah.getKodeMK().equals(kodeMK)) {
//                 return mataKuliah;
//             }
//         }
//         return null;
//     }
// }


package Jobsheet16;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;


public class Program {
    private List<Nilai> daftarNilai = new ArrayList<>();
    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private Queue<Mahasiswa> queueMahasiswa = new LinkedList<>(); // Queue untuk menghapus mahasiswa

    // Input data nilai untuk mahasiswa dan mata kuliah tertentu
    public void inputNilai(String nim, String kodeMK, double nilai) {
        Mahasiswa mahasiswa = cariMahasiswa(nim);
        MataKuliah mataKuliah = cariMataKuliah(kodeMK);

        if (mahasiswa != null && mataKuliah != null) {
            Nilai nilaiMahasiswa = new Nilai(mahasiswa, mataKuliah, nilai);
            daftarNilai.add(nilaiMahasiswa);
            System.out.println("Nilai berhasil dimasukkan untuk Mahasiswa dengan NIM " + nim +
                    " pada Mata Kuliah dengan kode " + kodeMK);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " atau Mata Kuliah dengan kode " + kodeMK +
                    " tidak ditemukan.");
        }
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
        queueMahasiswa.add(mahasiswa); // Tambahkan mahasiswa ke Queue
    }

    // Metode untuk menambahkan mata kuliah ke dalam daftar
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // Hapus data mahasiswa
    public void hapusMahasiswa() {
        if (!queueMahasiswa.isEmpty()) {
            Mahasiswa mahasiswa = queueMahasiswa.poll(); // Hapus mahasiswa dari Queue
            daftarMahasiswa.remove(mahasiswa);
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.getNIM() + " telah dihapus.");
        } else {
            System.out.println("Tidak ada mahasiswa yang dapat dihapus.");
        }
    }

    public void tampilkanDaftarMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Daftar mahasiswa kosong.");
        } else {
            System.out.println("\u001B[32m+---------------------+");
            System.out.println("|   Daftar Mahasiswa  |");
            System.out.println("+---------------------+\u001B[0m");

            for (Mahasiswa mahasiswa : daftarMahasiswa) {
                System.out.println("\u001B[32m+-------------------------------------------------------+\u001B[0m");
                System.out.println("\u001B[32m| NIM: " + mahasiswa.getNIM() + "\t\t\t\t\t\t|");
                System.out.println("\u001B[32m| Nama: " + mahasiswa.getNama() + "\t\t\t\t\t\t|");
                System.out.println("\u001B[32m| Nomor Telepon: " + mahasiswa.getNomorTelepon() + "\t\t\t\t\t|");
                System.out.println("\u001B[32m+-------------------------------------------------------+\u001B[0m");
            }

        }
    }

    // Tampilkan nilai semua mahasiswa
    public void tampilNilai() {
        System.out.println(
                "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
        System.out.println(
                "| NIM             |         Nama         |    Nomor Telepon     |                        Mata Kuliah                       |   SKS     | Nilai |");
        System.out.println(
                "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
        for (Nilai nilai : daftarNilai) {
            String nim = nilai.getMahasiswa().getNIM();
            String nama = nilai.getMahasiswa().getNama();
            String nomorTelepon = nilai.getMahasiswa().getNomorTelepon();
            String kodeMK = nilai.getMataKuliah().getKodeMK();
            String namaMK = nilai.getMataKuliah().getNamaMK();
            int sks = nilai.getMataKuliah().getSKS();
            double nilaiMahasiswa = nilai.getNilai();

            System.out.printf("| %-16s| %-21s| %-21s| %-57s| %-10s| %-5.1f |\n", nim, nama, nomorTelepon,
                    kodeMK + " - " + namaMK, sks, nilaiMahasiswa);
        }
        System.out.println(
                "+-----------------+----------------------+----------------------+----------------------------------------------------------+-----------+-------+");
    }

    // Cari nilai mahasiswa berdasarkan NIM
    public void cariNilaiMahasiswa(String nim) {
        List<Nilai> nilaiMahasiswa = daftarNilai.stream()
                .filter(nilai -> nilai.getMahasiswa().getNIM().equals(nim))
                .collect(Collectors.toList());

        if (!nilaiMahasiswa.isEmpty()) {
            System.out.println();
            System.out.println("Nilai Mahasiswa dengan NIM " + nim + ":");
            for (Nilai nilai : nilaiMahasiswa) {
                System.out.println("Mata Kuliah:\n " + nilai.getMataKuliah() +
                        ", Nilai: " + nilai.getNilai());
            }
        } else {
            System.out.println();
            System.out.println("Nilai Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    // Urutkan data mahasiswa dari nilai terkecil ke terbesar
    public void urutkanNilaiAscending() {
        daftarNilai.sort(Comparator.comparingDouble(Nilai::getNilai));
    }

    // Metode untuk mencari mahasiswa berdasarkan NIM
    private Mahasiswa cariMahasiswa(String nim) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNIM().equals(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    // Metode untuk mencari mata kuliah berdasarkan kode
    private MataKuliah cariMataKuliah(String kodeMK) {
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getKodeMK().equals(kodeMK)) {
                return mataKuliah;
            }
        }
        return null;
    }
}
