public class Admin {
    String nama, username, password, email, alamat, nomer_telepon;

    public Admin() {

    }

    public Admin(String nm, String usr, String pass, String eml, String almt, String no_telepon) {
        nama = nm;
        username = usr;
        password = pass;
        email = eml;
        alamat = almt;
        nomer_telepon = no_telepon;

    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama + ", Username: " + username + " Password: " + password + ", email: " + email
                + " alamat: " + alamat + ", Nomor Telepon: " + nomer_telepon);
    }

}
