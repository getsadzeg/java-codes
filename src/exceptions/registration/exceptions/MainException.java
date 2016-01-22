
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
        getExceptions()[getAmount()] = ex;
        setAmount(getAmount() + 1);
    }

    public Exception[] getExceptions() {
        return exceptions;
    }

    

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
