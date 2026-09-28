import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {

        // Create a Scanner for keyboard input
        // Ask the user to enter their age
        // Read the age
        // If the age is 21 or older
        //     Display that the user gets a wrist band
        // Otherwise
        //     Do nothing

        Scanner in = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();

            if (age >= 21) {
                System.out.println("You get a paper wrist band.");
            }
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
    }
}
