import java.sql.SQLOutput;
import java.util.Scanner;
public class Proj_2_MadLib {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String adj1, adj2, adj3, placeName, clothing, hobby;
        String girlName, boyName, manName, occupation1, occupation2;
        System.out.print("Enter an Adjective:\t");
        adj1 = ob.nextLine();
        System.out.print("Enter an Adjective:\t");
        adj2 = ob.nextLine();
        System.out.print("Enter an Adjective:\t");
        adj3 = ob.nextLine();
        System.out.print("Enter an Place:\t");
        placeName = ob.nextLine();
        System.out.print("Enter an clothing:\t");
        clothing = ob.nextLine();
        System.out.print("Enter a Hobby:\t");
        hobby = ob.nextLine();
        System.out.print("Enter Girl Name:\t");
        girlName = ob.nextLine();
        System.out.print("Enter Boy Name:\t");
        boyName = ob.nextLine();
        System.out.print("Enter Man Name:\t");
        manName = ob.nextLine();
        System.out.print("Enter an Occupation:\t");
        occupation1 = ob.nextLine();
        System.out.print("Enter an Occupation:\t");
        occupation2 = ob.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + girlName + " who was a " + adj2 + " " + occupation1 + " in the kingdom of " + placeName + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby +". She wanted to marry the " +  adj3 + " " + occupation2 + " named " + boyName + ". But her father, King " + manName + " forbid her from seeing him.");


    }
}
