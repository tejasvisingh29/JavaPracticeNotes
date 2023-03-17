package practiceTests;

import java.util.Scanner;

public class math2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter value of x:" );
        double x = scanner.nextDouble();

        System.out.println("Enter value of y:" );
        double y = scanner.nextDouble();

        System.out.println("Enter value of z:" );
        double z = scanner.nextDouble();

        double result = 0;
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) -Math.abs(z));
        System.out.println(result);
        scanner.close();
    }
}
