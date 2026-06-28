//multiple Thread
package UnitThree;

class myThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 is running");
    }
}

class myThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread 2 is running");
    }
}

public class ThreadExample{
    public static void main(String[] args){
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();

        t1.start();
        t2.start();

        System.out.println("main thread is running");
    }
}