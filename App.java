public class App {
    public static void main(String[] args) {
        int loopCount = 0;

        Clothes clothes = new Clothes("jeans", "1038 hoodie", "durag", "silver", "none", "sneakers");
        Character me = new Character("brown", "micheal", "black", "black", "locs", clothes);

        do {
            me.move();

            if (loopCount > 100) {
                break;
            }
            loopCount += 1;

        } while (true);
    }
}
