public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true){
            try {
                bankAccount.withDraw(6000);
                System.out.println("С вашего счета были сняты 6000");
            } catch (LimitException e) {
                bankAccount.setAmount(0);
                System.out.println("Все средства были сняты");
                break;
            }
        }

    }
}