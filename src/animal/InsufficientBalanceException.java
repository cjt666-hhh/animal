package animal;

public class OutOfMoneyException extends RuntimeException{

    public OutOfMoneyException() {
    }

    public OutOfMoneyException(String message) {
        super(message);
    }
}
