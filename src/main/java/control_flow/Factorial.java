package control_flow;

import java.util.Scanner;

public class Factorial {
    
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
        sc.close();
    }
}
