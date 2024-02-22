public class Dragon {

    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("Game Over!");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}