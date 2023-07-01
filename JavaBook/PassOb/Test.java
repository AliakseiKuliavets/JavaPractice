package Example.PassOb;

public class Test {
    int a,b;
    Test(int i, int j) {
        a = i;
        b = j;
    }
    boolean equalTo(Test o) {  //Возвратить true , если объект о равен вызывающему объекту .
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return  false;
        }
    }
}
