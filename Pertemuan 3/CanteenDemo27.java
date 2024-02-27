import java.util.Scanner;

public class CanteenDemo27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        String name = input.nextLine();
        System.out.print("Masukan harga: ");
        double price = input.nextDouble();
        System.out.print("Masukan stock: ");
        int stock = input.nextInt();

        Item27 item1 = new Item27();
        item1.name = "Nasi Goreng";
        item1.price = 15000;
        item1.stock = 10;

        Item27 item2 = new Item27();
        item1.name = "Donat Gula";
        item1.price = 3000;
        item1.stock = 20;

        Item27 item3 = new Item27();
        item1.name = "Cimory";
        item1.price = 7000;
        item1.stock = 15;

        Item27 item4 = new Item27(name, price, stock);
        item4.displayInfo();

        Item27[] items = new Item27[3];
        items[0] = item1;
        items[0] = item2;
        items[0] = item3;

        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
        }

    }
}
