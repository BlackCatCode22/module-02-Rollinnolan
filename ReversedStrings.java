import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        System.out.println("Welcome to My Strings program");

        // Create a Scanner object to get a string from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Please enter a string of characters...\n");
        String userInput = scanner.nextLine();

        // Output the line to reverse.
        System.out.println("\n\nThe string to reverse is: " + userInput + "\n\n");

        // Strings are a data structure meaning we can access individual characters like this
        char aCharFromAString = userInput.charAt(3);

        System.out.println("\n\n aCharFromAString is " + aCharFromAString);

        String reversedString = "";
        for (int i = 0; i < userInput.length(); i++) {
            System.out.println("\n  " + userInput.charAt(i) );
            reversedString = userInput.charAt(i) + reversedString;
        }

        System.out.println("\n reversed Str = " + reversedString);

    }
}