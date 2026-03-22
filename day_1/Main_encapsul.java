 class BankAccount {

private int balance;

public void setBalance(int balance) {
    this.balance = balance;
}

public int getBalance() {
    return balance;
}
}

public class Main_encapsul {

public static void main(String[] args) {

    BankAccount acc = new BankAccount();

    acc.setBalance(5000);

    System.out.println(acc.getBalance());
}
}