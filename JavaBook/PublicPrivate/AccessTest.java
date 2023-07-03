package Example.PublicPrivate;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        ob.a = 10;
        ob.b = 20;

        // Поступать так нельзя , т. к. возникнет ошибка.
//      ob.с = 100 ; // Ошибка !
                // Получать доступ к члену с необходимо через его методы .
                ob.setc(100) ; // нормально
        System.out.println("a,b и с: " + ob.a + " " +
                ob.b + " " + ob.getc());
    }
}
