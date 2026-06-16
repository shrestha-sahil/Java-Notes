package UnitOne;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrrayExample {
    public static void main(String[] args){
        Integer[] arr = {1,2767,3,4,5};

        System.out.println(arr[3]);

        Arrays.sort(arr);
Arrays.sort(arr, Collections.reverseOrder());
        //for each loop
        for(Object num: arr){
            System.out.println(num);
        }
    }
}
