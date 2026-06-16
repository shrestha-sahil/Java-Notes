/* Instructions
Inside the Main class, complete the following steps:
Create a String variable named city and set it to "London"
Create an int variable named population and set it to 9000000
Inside main(), create an object of Main named myObj
Print city and population using myObj */

public class example2{
    String city;
    int population;

    public static void main(String[] args){
        example2 myObj = new example2();

        myObj.city = "London";
        myObj.population = 9000000;

        System.out.println("the name of the city is :" + myObj.city);
        System.out.println("the population of the city is :" + myObj.population);
    }
}