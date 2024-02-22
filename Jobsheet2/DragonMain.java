public class DragonMain {

    public static void main(String[] args) {
        int width = 10;
        int height = 10;
        Dragon dragon = new Dragon(5, 5, width, height);

        // Contoh penggunaan
        dragon.moveLeft();
        dragon.moveUp();
        dragon.moveRight();
        dragon.moveDown();

        // Menampilkan posisi dragon
        System.out.println("Posisi dragon: (" + dragon.getX() + ", " + dragon.getY() + ")");
    }
}
