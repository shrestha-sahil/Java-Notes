package UnitOne;

class BankAccount{
    int balance = 10000;
    synchronized void withdraw(int money){
        if (balance >= money){
            System.out.println(Thread.currentThread().getName()+ "withdraw"+money);
            balance -=money;
            System.out.println("Remaining balacnce" + balance);
        }else {
            System.out.println("insufficent balcne " +Thread.currentThread().getName());
        }
    }
}
public class ThreadSync {
    public static void main(String[] args){
    BankAccount bankAccount = new BankAccount();
    Thread t1 = new Thread(()-> bankAccount.withdraw(40000));
    Thread t2 = new Thread(() -> bankAccount.withdraw(30000));

    t1.start();
    t2.start();
    }
}
