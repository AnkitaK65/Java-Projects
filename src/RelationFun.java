import java.sql.SQLOutput;

public class RelationFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge =  34;
        int yourAge = 24;
        int bobsAge = 24;
        String myName = "John";
        String yourName = "John";


        /*
        <
        >
        <=
        >=
        ==   equality operator : can't be used to compare reference type variable
        can be used to check if its same object. i.e. holds same address
         */

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational Operations
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge  > yourAge?:" + ageComparison);

        boolean nameComparison = myName.equals(yourName); //equals method
        System.out.println("Do name Match?:" + nameComparison);
    }
}
