package UnitOne;

public class TwoDArray {
    public static void main(){
    int [][] arr2d = {
            {2, 23, 45, 56},
            {2, 3, 4, 56, 67},
            {34,23,56,76}
        };
    System.out.println(arr2d[2][3]);
    for(int i=0; i<arr2d.length; i++){
        for (int j=0; j< arr2d.length; j++){
            System.out.println(arr2d[i][j]);
        }
    }
//    for (int[] data:arr2d){
//        for (int i:data){
//            System.out.println(i+"");
//        }
//        System.out.println();
//    }
    }
}
