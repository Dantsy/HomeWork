package Basic.HomeWork;

public class Account {
    private final long id;
    private final int balance;

    public Account(long id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}
