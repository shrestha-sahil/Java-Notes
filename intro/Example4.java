//Mixing text and numbers in java
public class Example4{
    public static void main (String[] args){
        // final int final_a = 1;
        //  int  a = 10;
        // int b = 2;
        // System.out.println("The sum of a and b is: " + (a + b)); // this print sum is 3
        // System.out.println("The value of b is: " + a + b); //this print sum is 12

        //using of constant in java using final keyword
        final int Minutes_in_hours = 60;
        final int Seconds_in_minutes = 60;
        System.out.println("The number of minutes and second in a year is : " + (Minutes_in_hours * Seconds_in_minutes));
        System.out.println("The value is :" + Minutes_in_hours + Seconds_in_minutes); // this print sum is 3600
    }
}