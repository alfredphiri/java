// importing scanner class
import java.util.Scanner;

public class alfred {
    public static void main(String[] args) {
        System.out.println("Hello Everyone");


        // variable declaration

        int age = 26;
        String firstName = "Alfred";
        String lastName = "Phiri";
        double height = 1.75;
        boolean isStudent = true;
        char gender = 'M';
        
        // print variables

        System.out.println("\n\n MY PERSONAL DETAILS\n\n");

        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Gender: " + gender);

        // declaration of variables on a single line

        int x = 10, y = 20, z = 30;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // reinitialization of variables
        System.out.println("Reinitialization of variables");
        age = 27;
        height = 1.85;
        isStudent = false;
    
        
        System.out.println("New Age: " + age);
        System.out.println("New Height: " + height);
        System.out.println("Is Student: " + isStudent);

        // initialising a scanner object

        Scanner object = new Scanner(System.in);

        System.out.print("Enter Your Age Brother: ");
        int brotherAge = object.nextInt();
        System.out.println("Brother's Age: " + brotherAge);
        object.close();
    }
}