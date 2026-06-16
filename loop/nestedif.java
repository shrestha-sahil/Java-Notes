    public class nestedif{
    public static void main(String[] args){
        int i = 10;
        if(i>=9){
            System.out.println("Condition is true");
            if(i>10){
                System.out.println("i is greater than 10");
            }else{
                System.out.println("i is not greater than 10");
            }
        }else{
            System.out.println("Condition is false");
            }
        }
}
