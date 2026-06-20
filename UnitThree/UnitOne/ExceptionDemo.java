package UnitOne;

public class ExceptionDemo {
    public static void main(String[] args){
    try{
        int a = 10/2;

        System.out.println(a);

        try{
            int[] arr = {2,3,4};
            System.out.println(arr[3]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }catch (Exception e){
        System.out.println(e);
    }finally {
        System.out.println("finally called");
    }
    }
}
