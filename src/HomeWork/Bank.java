package HomeWork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
public class Bank {
    private final Map<Client, List<Account>> clientAccounts;

    public Bank() {
        clientAccounts = new HashMap<>();
    }
    public void addClient(Client client) {
        clientAccounts.put(client, new ArrayList<>());
    }
    public void removeClient(Client client) {
        clientAccounts.remove(client);
    }
    public void addAccount(Client client, Account account) {
        List<Account> accounts = clientAccounts.get(client);
        if (accounts != null) {
            accounts.add(account);
        }
    }
    public void removeAccount(Client client, Account account) {
        List<Account> accounts = clientAccounts.get(client);
        if (accounts != null) {
            accounts.remove(account);
        }
    }
    public List<Account> getAccounts(Client client) {
        return clientAccounts.getOrDefault(client, new ArrayList<>());
    }
    public Optional<Client> findClient(Account account) {
        for (Map.Entry<Client, List<Account>> entry : clientAccounts.entrySet()) {
            if (entry.getValue().contains(account)) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }
}
