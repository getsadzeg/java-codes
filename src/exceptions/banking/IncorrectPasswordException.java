package exceptions.banking;
public class IncorrectPasswordException extends Exception {
	public IncorrectPasswordException() {

	}
	public IncorrectPasswordException(String msg) {
		super(msg);
	}
}