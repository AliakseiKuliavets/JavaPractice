package Example.ArraysRecurs;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        RecTest ob = new RecTest(number);
        for (int i = 0; i < number; i++) ob.values[i] = i;
        ob.printArray(number);
    }
}
