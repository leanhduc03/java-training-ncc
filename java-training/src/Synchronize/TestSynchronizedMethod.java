package Synchronize;

public class TestSynchronizedMethod {
    public static void main(String[] args) {

        SynchronizedMethod nonSynchronizedMethod = new SynchronizedMethod();

        ThreadOne threadOne = new ThreadOne(nonSynchronizedMethod);
        threadOne.setName("ThreadOne");

        ThreadTwo threadTwo = new ThreadTwo(nonSynchronizedMethod);
        threadTwo.setName("ThreadTwo");

        threadOne.start();
        threadTwo.start();

    }

}
 class SynchronizedMethod {

    public synchronized void printNumbers() { //  public void printNumbers() - output sẽ khác nếu không có synchronized
        System.out.println("Starting to print Numbers for " + Thread.currentThread().getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        System.out.println("Completed printing Numbers for " + Thread.currentThread().getName());
    }
}
class ThreadOne extends Thread {

    SynchronizedMethod nonSynchronizedMethod;

    public ThreadOne(SynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}

class ThreadTwo extends Thread {

    SynchronizedMethod nonSynchronizedMethod;

    public ThreadTwo(SynchronizedMethod nonSynchronizedMethod) {
        this.nonSynchronizedMethod = nonSynchronizedMethod;
    }

    @Override
    public void run() {
        nonSynchronizedMethod.printNumbers();
    }
}