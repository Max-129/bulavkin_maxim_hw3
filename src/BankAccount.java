
public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = amount + sum;
    }



    public void withDraw(double sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("У вас не хватает денежных средств! Вы хотели снять " + sum);
        }else {amount = amount - sum;}
    }

}
