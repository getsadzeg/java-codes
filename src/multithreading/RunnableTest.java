
package multithreading;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RunnableTest implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(RunnableTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            
                    
            System.out.println(Thread.currentThread().getName());
        }
    }
    
}
