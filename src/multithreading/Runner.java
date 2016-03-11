
package multithreading;


public class Runner {
    public static void main(String[] args) {
        RunnableTest r1 = new RunnableTest();
        Thread t1 = new Thread(r1);
        
        RunnableTest r2 = new RunnableTest();
        Thread t2 = new Thread(r2);
        
        RunnableTest r3 = new RunnableTest();
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
