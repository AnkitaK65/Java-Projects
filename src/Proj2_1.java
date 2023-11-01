import java.util.Scanner;
public class Proj2_1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        double n1, n2, n3;
        System.out.println("Enter 3 nos.: ");
        n1 = ob.nextDouble();
        n2 = ob.nextDouble();
        n3 = ob.nextDouble();
        System.out.println("Average is: " + (n1+n2+n3)/3);



    }
}
