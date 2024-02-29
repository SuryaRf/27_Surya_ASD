public class Karyawan {
    String nama, username, password, email, alamat, nomer_telepon, gaji, jabatan, jenis_Kelamin;

    public Karyawan() {

    }

    public Karyawan(String nm, String usr, String pass, String eml, String almt, String no_telepon, String gj,
            String jbtn, String jk) {
        nama = nm;
        username = usr;
        password = pass;
        email = eml;
        alamat = almt;
        nomer_telepon = no_telepon;
        gaji = gj;
        jabatan = jbtn;
        jenis_Kelamin = jk;

    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", Username: " + username + " Password: " + password + ", email: " + email
                + " alamat: " + alamat + ", Nomor Telepon: " + nomer_telepon + ", Gaji: " + gaji
                + " Jabatan: " + jabatan + ", Jenis Kelamin: " + jenis_Kelamin);
    }
}





