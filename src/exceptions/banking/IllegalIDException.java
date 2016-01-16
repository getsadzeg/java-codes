package exceptions.banking;
public class IllegalIDException extends Exception {
	public IllegalIDException() {

	}
	public IllegalIDException(String msg) {
		super(msg);
	}
}