package UnitOne;
import java.util.*;
public class QueueInterface {
        public static void main(String[] args){
            Queue<String> queue = new LinkedList<>();
            queue.add("r");
            queue.add("t");;

            System.out.println(queue);
            System.out.println(queue.poll());
            System.out.println(queue.peek());
        }
    }
