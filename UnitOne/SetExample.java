package UnitOne;
import java.util.*;
public class SetExample {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(50);
        set.add(30);
        set.add(20);

        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
