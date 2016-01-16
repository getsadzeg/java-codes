package exceptions.banking;
public class IllegalPasswordException extends Exception {
	public IllegalPasswordException() {

	}
	public IllegalPasswordException(String msg) {
		super(msg);
	}
}