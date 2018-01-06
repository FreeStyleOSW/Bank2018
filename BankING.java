package Bank2018;

import java.util.ArrayList;
import java.util.List;

public class BankING implements Bank{
    private List<Client> listOfClients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        System.out.println(
                "Witaj " + client.getName() +
                        " Dzięki że zaufałeś nam!\n"
        );
        sendNotificationToClient(client);
        listOfClients.add(client);
    }

    @Override
    public void deleteClient(String name) {
        for (Client client: listOfClients){
            if (client.getName() == name){
                listOfClients.remove(client);
                return;
            }
        }
    }

    @Override
    public void addAccountToClient(Client client,String nameAccount) {
        client.getAccounts().add(new Account(nameAccount));
    }

    @Override
    public void deleteAccountOfClient(Client client, String nameAccount) {
        for (Account account: client.getAccounts()){
            if (account.getNameAccount() == nameAccount){
                client.getAccounts().remove(account);
                return;
            }
        }
    }

    @Override
    public List<Client> listAllClients() {
        return listOfClients;
    }

    @Override
    public void addMoneyToClientAccount(Client client, String nameAccount, int money) {
        for (Account account: client.getAccounts()){
            if (account.getNameAccount() == nameAccount){
                account.addMoney(money);
                return;
            }
        }
    }

    @Override
    public void removeMoneyFromClientAccount(Client client, String nameAccount, int money) {
        for (Account account: client.getAccounts()){
            if (account.getNameAccount() == nameAccount){
                account.removeMoney(money);
                return;
            }
        }
    }

    @Override
    public void sendNotificationToClient(Client client) {
        String email = client.getEmail();
        String  kolega = " nowych kolegów";
        if (listOfClients.size() == 1) kolega = " nowego kolege";
        for (Client c : listOfClients){
            System.out.println(
                    "Wiadomość dla " + c.getName() + ":\n" +
                    "Hej " + c.getName() +
                    ", masz " + listOfClients.size() + kolega + "\n"
            );
        }
        // Method to send email ...
        // ........................
        // ........................
        // ........................
    }
}
