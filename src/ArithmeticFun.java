import java.sql.SQLOutput;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        int result = a + b; // + is addition operator
        int difference =  a-b; // binary operators
        int product =  a*b;
        int quotient = b/a;
        int remainder =  b % a;

        System.out.println("result is " + result); // + is concatenation
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product );
        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is "+ remainder);

        result += 20; //compound operators
        System.out.println("Now result is : " + result);
        //increment & decriment operators are unary operators
        result++;

        System.out.println("Now result is : " + result);

        result--;
        System.out.println("Now result is : " + result);

        product *= 2;
        System.out.println("now product is " + product);

    }
}
