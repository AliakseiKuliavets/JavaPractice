package Example.PublicPrivate;

public class Test {
    int a;           // стандартный доступ
    public int b;    // открытый доступ
    private int c;    // закрытый доступ

    void setc(int i) {
        c = i;
    }
    int getc() {
        return c;
    }
}
