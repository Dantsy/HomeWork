package HomeWork4;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client client1 = new Client("Дмитрий", 45);
        Account account1 = new Account(client1, 1, 265);
        Account account2 = new Account(client1, 2, 125);
        bank.addAccount(client1, account1);
        bank.addAccount(client1, account2);

        Client client2 = new Client("Анастасия", 31);
        Account account3 = new Account(client2, 3, 75);
        bank.addAccount(client2, account3);

        // Поиск счетов по клиентской базе
        List<Account> client1Accounts = bank.getAccounts(client1);
        System.out.println("Счета для клиентов " + client1.getName() + ":");
        for (Account account : client1Accounts) {
            System.out.println("Номер аккаунта: " + account.getAccountNumber() + ", Баланс: " + account.getBalance());
        }

        // Поиск клиента по счету в банке
        Account searchAccount = account3;
        Client foundClient = bank.findClient(searchAccount);
        System.out.println("Клиент найден для учетной записи " + searchAccount.getAccountNumber() + ": " + foundClient.getName());
    }
}
