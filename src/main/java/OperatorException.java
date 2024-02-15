public class OperatorException extends Exception {
    private final String operator;

    public OperatorException(String message, String operator) {
        super(message);
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
