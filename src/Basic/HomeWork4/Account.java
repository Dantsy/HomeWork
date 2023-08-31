package Basic.HomeWork4;

public class Account {
    private Client client;
    private int accountNumber;
    private int balance;
    public Account(Client client, int accountNumber, int balance) {
        this.client = client;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Client getClient() {
        return client;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
}
