import  java.util.Scanner;

public class PersegiPanjangDemo_1 {
    public static void main(String[] args) {
        Scanner sc27 =  new Scanner(System.in);

        PersegiPanjang27[] arrayoOfPersegiPanjang = new PersegiPanjang27[3];

        for (int i = 0; i < 3; i++) {
            arrayoOfPersegiPanjang[i] = new PersegiPanjang27();
            System.out.println("Persegi panjang ke-" + ( i+1 ));
            System.out.print("Masukan Panjang: ");
            arrayoOfPersegiPanjang[i].panjang = sc27.nextInt();
            System.out.print("Masukan lebar: ");
            arrayoOfPersegiPanjang[i].lebar = sc27.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i+1) + ", Panjang: ");
            arrayoOfPersegiPanjang[i].cetakInfo();
        }

    }
}
