import java.util.Scanner;

public class PersegiPanjangDemo_2 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        System.out.print("Masukan Panjang Length: ");
        int panjangLength = sc27.nextInt();
        PersegiPanjang27[] arrayoOfPersegiPanjang = new PersegiPanjang27[panjangLength];
        int panjang, lebar;

        for (int i = 0; i < panjangLength; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukan Panjang: ");
            panjang = sc27.nextInt();
            System.out.print("Masukan lebar: ");
            lebar = sc27.nextInt();
            arrayoOfPersegiPanjang[i] = new PersegiPanjang27(panjang, lebar);
        }

        System.out.println();

        for (int i = 0; i < panjangLength; i++) {

            System.out.println(
                    "Persegi Panjang ke- " + (i + 1));


            arrayoOfPersegiPanjang[i].cetakInfo();
            System.out.print("Luas: " + arrayoOfPersegiPanjang[i].hitungLuas()
                    + ", Keliling: "
                    + arrayoOfPersegiPanjang[i].hitungKeliling());
                    System.out.println();
                    System.out.println();
        }

    }
}
