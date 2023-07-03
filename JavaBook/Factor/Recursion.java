package Example.Factor;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(f.fact(n));
    }
}
