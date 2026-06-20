package UnitOne;

public class Branching {
    public static void main(String[] args){
        //1. Break
        for(int i=1; i<=7; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Break data" + i);
        }

        //2. Continue
        for(int i=1; i<=7; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("continue data" + i);
        }

    }
}
