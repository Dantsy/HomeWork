package HW;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Client dmitriy = new Client(45);
        Account dmitriyAccount1 = new Account(123456, 574.0);
        Account dmitriyAccount2 = new Account(234567, 241.0);
        bank.addClient(dmitriy);
        bank.addAccount(dmitriy, dmitriyAccount1);
        bank.addAccount(dmitriy, dmitriyAccount2);

        Client anastasia = new Client(31);
        Account anastasiaAccount = new Account(345678, 123.0);
        bank.addClient(anastasia);
        bank.addAccount(anastasia, anastasiaAccount);

        // Поиск всех счетов по клиенту
        List<Account> dmitriyAccounts = bank.getAccounts(dmitriy);
        System.out.println("Счета Дмитрия:");
        for (Account account : dmitriyAccounts) {
            System.out.println("Номер счета: " + account.getAccountNumber() + ", Баланс: " + account.getBalance());
        }

        // Поиск клиента по счету
        Client client = bank.findClient(anastasiaAccount);
        System.out.println("\nКлиент, владеющий счетом " + anastasiaAccount.getAccountNumber() + ":");
        System.out.println("Возраст: " + client.getAge());
    }
}
