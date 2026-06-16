//Inner and outer loop in java
public class example4{
    public static void main(String[] args){
        int i = 10;
        int j = 10;
        //outer loop
        for (i = 0; i<=7; i++){
            System.out.println("outer loop: " + i);

            //inner loop
            for (j = 0; j<=5; j++){
                System.out.println("inner loop: " + j);
            }
        }
    }
}