package Example.BoxConstructorOverload;


public class BoxDemo {
    public static void main(String[] args) {
        //Создать объекты коробок с применением различных конструкторов .
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);


        System.out.println("Обьем mybox1 равен " + mybox1.volume());
        System.out.println("Обьем mybox1 равен " + mybox2.volume());
        System.out.println("Обьем mycube равен " + mycube.volume());
    }

}
