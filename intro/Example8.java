public class Example8{
    public static void main(String[] args){
        int myInt = 10;
        double myDouble = 5.5;

        System.out.println(myInt);
        System.out.println(myDouble);
        //Automatic type conversion
        double result = myInt + myDouble; //myInt will be converted to double before
        System.out.println(result);

        int x = 10;
        x += 5; //assignment operator in java

        System.out.println(x); // Output will be 15
    }
}