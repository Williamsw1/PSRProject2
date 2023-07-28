package interfaceAbstractProject;

//Interface for common bank transaction methods
interface BankTransaction {
 void deposit(double amount);
 void withdraw(double amount);
 void displayBalance();
}

//Abstract class for Bank Account with constructor
abstract class BankAccount implements BankTransaction {
 private String accountNumber;
 protected double balance;

 // Constructor for BankAccount
 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Common method to display account information
 public void displayAccountInfo() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: $" + balance);
 }
}

//Concrete class SavingsAccount extending BankAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
     super(accountNumber, initialBalance);
     this.interestRate = interestRate;
 }

 // Implementing BankTransaction methods for SavingsAccount
 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= 0) {
         balance -= amount;
     } else {
         System.out.println("Insufficient funds!");
     }
 }

 @Override
 public void displayBalance() {
     System.out.println("Savings Account Balance: $" + balance);
 }
}

//Concrete class CheckingAccount extending BankAccount
class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
     super(accountNumber, initialBalance);
     this.overdraftLimit = overdraftLimit;
 }

 // Implementing BankTransaction methods for CheckingAccount
 @Override
 public void deposit(double amount) {
     balance += amount;
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= -overdraftLimit) {
         balance -= amount;
     } else {
         System.out.println("Overdraft limit exceeded!");
     }
 }

 @Override
 public void displayBalance() {
     System.out.println("Checking Account Balance: $" + balance);
 }
}


class BankMoneyTransaction {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 0.05);
     CheckingAccount checkingAccount = new CheckingAccount("CA456", 2000.0, 500.0);

     // Perform transactions for SavingsAccount
     savingsAccount.deposit(500.0);
     savingsAccount.withdraw(200.0);
     savingsAccount.displayAccountInfo();
     savingsAccount.displayBalance();

     // Perform transactions for CheckingAccount
     checkingAccount.deposit(1000.0);
     checkingAccount.withdraw(3000.0);
     checkingAccount.displayAccountInfo();
     checkingAccount.displayBalance();
 }
}

