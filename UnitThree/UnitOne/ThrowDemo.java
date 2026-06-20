package UnitOne;

public class ThrowDemo {
    public static void CheckAge(int age) throws InvalidAgeException {
        if (age < 18) {
            System.out.println("user not eligible");
        } else {
            System.out.println("user eligible");
        }
    }
public static void main(String[] args){
        try {
            CheckAge(23);

        }catch (InvalidAgeException e){
            throw new RuntimeException(e);
        }
}
}
