package UnitFour;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                if (age < 0) {
                    System.out.println("Age cannot be negative. Try again.");
                } else {
                    validInput = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer number.");
                scanner.nextLine(); // clear invalid input
            }
        }

        System.out.println("Your age is: " + age);

        scanner.close();
    }
}