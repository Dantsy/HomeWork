package HW;
import java.util.*;

public class Bank {
    private Map<Client, List<Account>> clientAccounts;
    private Map<Account, Client> accountClients;

    public Bank() {
        clientAccounts = new HashMap<>();
        accountClients = new HashMap<>();
    }

    public void addClient(Client client) {
        clientAccounts.put(client, new ArrayList<>());
    }

    public void addAccount(Client client, Account account) {
        List<Account> accounts = clientAccounts.get(client);
        accounts.add(account);
        accountClients.put(account, client);
    }

    public List<Account> getAccounts(Client client) {
        return clientAccounts.getOrDefault(client, new ArrayList<>());
    }

    public Optional<Client> findClient(Account account) {
        Client client = accountClients.get(account);
        return Optional.ofNullable(client);
    }
}
