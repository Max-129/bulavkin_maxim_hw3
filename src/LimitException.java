public class LimitException extends Throwable {
    private String LimitException;
    private double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String limitException, double remainingAmount) {
        LimitException = limitException;
        this.remainingAmount = remainingAmount;
    }

    public LimitException(String limitException) {
        LimitException = limitException;
    }
}
