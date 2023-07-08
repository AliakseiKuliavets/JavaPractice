package Example.Practice1111111111;

public class Char {
    public static void main(String[] args)
            throws java.io.IOException{ // конструкция которая необходима для обработки ошибок ввода
        char choice;
        choice = (char) System.in.read();
        // который читает
        //символы из стандартного ввода (возвращаемые в виде целых чисел, по
        //причине чего возвращаемое значение было преобразовано в char).
        System.out.println(choice);
    }
}
