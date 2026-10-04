package Function;
import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int n) {
        //loop
        if(n < 0){
            System.out.println("Invalid Number");
            return;
        }

        long factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        
    }
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        printFactorial(n);
    }
}
}