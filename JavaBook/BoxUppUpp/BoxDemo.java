package Example.BoxUppUpp;


public class BoxDemo {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDim(10 ,20,15);
        mybox2.setDim(3 ,6,9);

        System.out.println("Обьем равен " + mybox1.volume());
        System.out.println("Обьем равен " + mybox2.volume());
    }
}
