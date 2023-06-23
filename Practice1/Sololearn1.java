import java.util.Scanner;

public class Sololearn1 {
    public static void main(String[] args) {
                int priceProduct = 5;
                Scanner sc = new Scanner(System.in);
                int product = sc.nextInt();

                if (product == 1) {
                    System.out.println((priceProduct * 0.07)+priceProduct);
                }else if (product > 1){
                    String sum = String.format("%.2f",(product*(priceProduct + (priceProduct * 0.070001))*0.9));
                    System.out.println(sum);
                } else {
                    System.out.print("not");
                }
            }
        }

