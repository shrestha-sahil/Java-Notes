package UnitOne;
interface run{
    void running();
}

interface walk{
    void walking();
}

class exercise implements run, walk{

    @Override
    public void running() {
       System.out.println("running is good");
    }

    @Override
    public void walking() {

        System.out.println("walking is good");
    }
}


public class InterfaceExample {
    public static void main(String[] args){
        //Interface + multiple inheritance
exercise Exercise = new exercise();
Exercise.running();
Exercise.walking();
    }
}
