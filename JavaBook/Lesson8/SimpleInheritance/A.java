package Example.Lesson8.SimpleInheritance;

public class A {
    int i,j;
    void showij() {
        System.out.println(" i and j: " + i + " " + j );
    }
}
class B extends A {
    // создаем подкласс путем расширения класса А
    int k;
    void showk() {
        System.out.println("k: " + k);
    }
    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}
