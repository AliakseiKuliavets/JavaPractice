public class Ternary {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i; // получаем что 10 меньше 0 и присваимваем тогда k = i = 10;
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получаем что -10 меньше 0 и присваеиваем k = -i = -10
        System.out.println(i + " равно " + k);

    }
}
