package Basic.HomeWork;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //База аккаунтов
        Client dmitry = new Client("Дмитрий", 45);
        Account dmitryAccount1 = new Account(123456, 265);
        Account dmitryAccount2 = new Account(234567, 125);
        Account dmitryAccount3 = new Account(345678, 575);
        bank.addClient(dmitry);
        bank.addAccount(dmitry, dmitryAccount1);
        bank.addAccount(dmitry, dmitryAccount2);
        bank.addAccount(dmitry, dmitryAccount3);

        Client anastasia = new Client("Анастасия", 31);
        Account anastasiaAccount1 = new Account(456789, 75);
        Account anastasiaAccount2 = new Account(567890, 674);
        Account anastasiaAccount3 = new Account(678901, 256);
        bank.addClient(anastasia);
        bank.addAccount(anastasia, anastasiaAccount1);
        bank.addAccount(anastasia, anastasiaAccount2);
        bank.addAccount(anastasia, anastasiaAccount3);
        //Номера счетов банка
        System.out.println("Счета Дмитрия:");
        List<Account> dmitryAccounts = bank.getAccounts(dmitry);
        for (Account account : dmitryAccounts) {
            System.out.println("Номер счета: " + account.getId() + ", Баланс: " + account.getBalance());
        }
        System.out.println("\nСчета Анастасии:");
        List<Account> anastasiaAccounts = bank.getAccounts(anastasia);
        for (Account account : anastasiaAccounts) {
            System.out.println("Номер счета: " + account.getId() + ", Баланс: " + account.getBalance());
        }
        //Поиск клиента по счету в банке
        System.out.println("\nПоиск клиента по счету с id 2:");
        Optional<Client> clientOptional = bank.findClient(dmitryAccount2);
        clientOptional.ifPresent(client -> {
            System.out.println("Найден клиент: " + client.getName());
        });
    }
}
