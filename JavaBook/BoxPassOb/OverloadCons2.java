package Example.BoxPassOb;


public class OverloadCons2 {
    public static void main(String[] args) {
        //Создать объекты коробок с применением различных конструкторов .
        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1); // создать копиб обьекта mybox1


        System.out.println("Обьем mybox1 равен " + mybox1.volume());
        System.out.println("Обьем mybox1 равен " + mybox2.volume());
        System.out.println("Обьем mycube равен " + mycube.volume());
        System.out.println("Обьем myclone равен " + myclone.volume());
    }

}
