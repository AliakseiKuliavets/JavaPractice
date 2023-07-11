package Example.Lesson8.SimpleInheritance;

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        //Супперкласс можно использовать сам по себе
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое superOb: ");
        superOb.showij();
        System.out.println();

        // Подкласс имеет доступ ко всем открытм членам своего суперкласса
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое subOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();

        System.out.println("Сумма i,j и k в subOb" );
        subOb.sum();
    }
}
