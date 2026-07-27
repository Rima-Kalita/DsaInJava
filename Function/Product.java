package Function;

import java.util.Scanner;


public class Product {
    public static int CalculateProduct(int a, int b){
    return a * b;
}
    public static void main (String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of 2 numbers is :"+ CalculateProduct( a, b) );
    }

}