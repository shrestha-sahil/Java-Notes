package UnitOne;

class ThreadOne extends Thread{
    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Thread one"+i);
        }
    }
}


class ThreadTwo extends Thread{
    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            System.out.println("Thread Two"+i);
        }
    }
}

public class MultiThread {
    public static void main(String[] args){
    ThreadOne t1 = new ThreadOne();
    ThreadTwo t2 = new ThreadTwo();
    t1.start();
    t2.start();
    }
}
