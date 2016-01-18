
package registration.exceptions;


public class MainException extends Exception {

    
    public MainException() {
    }

    
    public MainException(String msg) {
        super(msg);
    }
    private final Exception exceptions[] = new Exception[10];
    private int amount;
    public void add(Exception ex) {
        exceptions[amount] = ex;
        amount++;
    }
    
}
