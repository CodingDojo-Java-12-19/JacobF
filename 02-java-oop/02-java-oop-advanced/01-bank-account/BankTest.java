public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        acc1.depositChecking(150.99);
        acc1.depositSavings(25.00);
        acc1.getAccountBalances();
        acc1.withdrawChecking(100.00);
    }
}