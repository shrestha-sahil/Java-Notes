package UnitOne;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args){
        //set interface abt array list

        List<String> list =  new ArrayList<>();
        list.add("Tukeshh");
        list.add("baral");
        list.add("puntu");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("apples"));

    }
}
