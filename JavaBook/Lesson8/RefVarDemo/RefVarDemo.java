package Example.Lesson8.RefVarDemo;

public class RefVarDemo {
    public static void main(String[] args) {
        var mc = new MyClass(10);
        System.out.println("Значение i в mc теперь равно " + mc.geti());
        mc.seti(19);
        System.out.println("Значение i в mc теперь равно " + mc.geti());
    }
}
