package Basic.HomeWork4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Bank {
    private Map<Client, List<Account>> accountsByClient;
    public Bank() {
        accountsByClient = new HashMap<>();
    }
    public void addAccount(Client client, Account account) {
        List<Account> accounts = accountsByClient.getOrDefault(client, new ArrayList<>());
        accounts.add(account);
        accountsByClient.putIfAbsent(client, accounts);
    }
    public List<Account> getAccounts(Client client) {
        return accountsByClient.getOrDefault(client, new ArrayList<>());
    }
    public Client findClient(Account account) {
        for (Map.Entry<Client, List<Account>> entry : accountsByClient.entrySet()) {
            if (entry.getValue().contains(account)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
