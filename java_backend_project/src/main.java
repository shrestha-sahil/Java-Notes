import java.util.Scanner;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentService();

        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");

        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch(choice){

            case 1:
                service.addStudent();
                break;

            case 2:
                service.viewStudent();
                break;

            case 3:
                service.searchStudent();
                break;

            case 4:
                service.updateStudent();
                break;

            case 5:
                service.deleteStudent();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}