package Example.BoxConstructor;


public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3,6,9);

        System.out.println("Обьем равен " + mybox1.volume());
        System.out.println("Обьем равен " + mybox2.volume());
    }
}
