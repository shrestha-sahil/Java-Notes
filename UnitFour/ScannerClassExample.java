package UnitFour;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args){

        //Scanner class object to get input from keyboard
        Scanner sc = new Scanner(System.in);

        //read single word
        System.out.println("Enter first Name:");
        String firstName = sc.nextLine();


        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();


        System.out.println("Enter address:");
        String address = sc.nextLine();


        System.out.println("Enter age:");
        int age = sc.nextInt();


        System.out.println("Enter your Street Address:");
        Double streetAdress = sc.nextDouble();

        System.out.println("First Name:"+ firstName);
        System.out.println("Last Name:"+ lastName);
        System.out.println("address:"+address);
        System.out.println("age:"+ age);
        System.out.println("Street Address:"+ streetAdress);


        sc.close();

    }
}
