package Sept_13092024;

import java.sql.SQLOutput;

public class Lab012 {
    public static void main(String[] args) {
        //Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
        //double a = 34;
        //double b = 10;
        //Print - a+b, a-b, ab, a/b, a%b all the outputs.
        double a = 34;
        double b = 10;
        System.out.printf("Addition of %f and %f is %f",a,b,a+b);
        System.out.println();
        System.out.printf("Subtraction of %f and %f is %f",a,b,a-b);
        System.out.println();
        System.out.printf("Multiplication of %f and %f is %f",a,b,a*b);
        System.out.println();
        System.out.printf("Division of %f and %f is %f",a,b,a%b);
        System.out.println();

    }
}

