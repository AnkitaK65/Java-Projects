import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        String name;
        String city;
        double dubInput;

        System.out.println("Enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine(); // To consume the new line
        System.out.println("Enter your real no: ");
        dubInput = keyboard.nextDouble();
        keyboard.nextLine(); // To consume the new line
        dubInput *= 2;

        System.out.println("Enter your city: ");
        city = keyboard.nextLine();
        System.out.println("Hello! " + name);
        System.out.println("Age " + age);
        System.out.println("City " + city);
        System.out.println("Doubled nO. " + dubInput);
    }
}
