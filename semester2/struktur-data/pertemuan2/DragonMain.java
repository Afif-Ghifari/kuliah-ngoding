public class DragonMain {
    public static void main(String[] args) {
        Dragon blue = new Dragon(2, 2, 3, 3);

        blue.moveLeft();
        blue.moveRight();
        blue.moveUp();
        blue.moveDown();

        blue.moveRight();
    }
}
