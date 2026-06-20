//swtich case in java
public class Example7{
    public static void main(String[] args){
        int day = 1;
        System.out.println("Enter the day number :" + day);
        switch (day){
            case 1: 
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thursday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
            default:
                System.out.println("please enter the valid day number");
        }
    //     boolean isjavafun = true;
    //     boolean imgirl = false;
    //     if (isjavafun && imgirl){
    //         System.out.println("java is fun");
    //     }else if (isjavafun || imgirl){
    //         System.out.println("java is fun but i am not a girl");
    // }else{
    //     System.out.println("java is not fun");
    // }
    }   
}
