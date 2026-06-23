package UnitFour;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {
    public static void main(){
    Scanner scanner = new Scanner(System.in);

    try{
        System.out.println("Enter your  age:");
        int age = scanner.nextInt();    //might throw an inputmismatchexception
        System.out.println("your age is :"+age);

    }catch (InputMismatchExample e){
        System.out.println("Invalid input! Please enter a integer number");
    }

    try{

    }catch (InputMismatchExample e){

    }
    }
}
