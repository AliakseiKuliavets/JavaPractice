package Example.StackUpArraysScanner;

import java.util.Scanner;

class TestStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размера первого стека: ");
        int num1 = sc.nextInt();
        Stack mystack1 = new Stack(num1);
        System.out.println("Введите размера второго стека: ");
        int num2 = sc.nextInt();
        Stack mystack2 = new Stack(num2);

        for (int i=0; i < num1; i ++) mystack1.push(i);
        for (int i=0; i < num2; i ++) mystack2.push(i);

        System.out.println("Stack in mystack1: ");
        for (int i=0; i < num1; i ++)
            System.out.println(mystack1.pop());

        System.out.println("Stack in mystack2: ");
        for (int i=0; i < num2; i ++)
            System.out.println(mystack2.pop());

    }
}
