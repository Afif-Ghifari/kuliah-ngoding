public class Dragon {
    int x, y, width, height;

    public Dragon(int xDragon, int yDragon, int mapWidth, int mapHeight) {
        x = xDragon;
        y = yDragon;
        width = mapWidth;
        height = mapHeight;
    }

    void moveLeft() {
        x -= 1;
        printPosition();
    }

    void moveRight() {
        x += 1;
        printPosition();
    }

    void moveUp() {
        y -= 1;
        printPosition();
    }
    
    void moveDown() {
        y += 1;
        printPosition();
    }
    
    void printPosition() {
        System.out.println("Dragon position is: " + x + "," + y);
        detectCollision(x, y);
    }

    void detectCollision(int x, int y) {
        if (x < 0  || x == this.width || y < 0 || y == height) {
            System.out.println("Game Over");
        }
    }
}
