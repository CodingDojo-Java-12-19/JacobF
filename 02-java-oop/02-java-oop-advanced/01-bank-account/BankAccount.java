import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    // STATIC VARIABLES
    private static int numOfAccounts;
    private static double totalBalanceOfBank;

    public BankAccount() {
        this.accountNumber = generateRandomID();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numOfAccounts++;
        totalBalanceOfBank += 0;
    }

    public double getCheckingBalance() {
        System.out.println("Current Checking Balance: " + this.checkingBalance);
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        System.out.println("Current Savings Balance: " + this.savingsBalance);
        return this.savingsBalance;
    }
    
    public void getAccountBalances() {
        System.out.println("Current Checking Balance: " + this.checkingBalance + " Current Savings Balance: " + this.savingsBalance);
    }

    public void depositChecking(double amount) {
        this.checkingBalance += amount;
        totalBalanceOfBank += amount;
        System.out.println("New checking balance: " + this.checkingBalance);
    }

    public void depositSavings(double amount) {
        this.savingsBalance += amount;
        totalBalanceOfBank += amount;
        System.out.println("New savings balance: " + this.savingsBalance);
    }

    public void withdrawChecking(double amount) {
        if (amount > this.checkingBalance) {
            throw new Error("Insufficient funds in checking account!");
        } else {
            this.checkingBalance -= amount;
            totalBalanceOfBank -= amount;
            System.out.println("New checking balance: " + this.checkingBalance);
        }
    }

    public void withdrawSavings(double amount) {
        if (amount > this.savingsBalance) {
            throw new Error("Insufficient funds in savings account!");
        } else {
            this.savingsBalance -= amount;
            totalBalanceOfBank -= amount;
            System.out.println("New savings balance: " + this.savingsBalance);
        }
    }

    // STATIC METHODS 
    private static String generateRandomID() {
		String returnStr = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			returnStr += r.nextInt(10);
		}
		return returnStr;
    }
    
}