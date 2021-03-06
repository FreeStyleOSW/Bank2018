package Bank2018;

import java.util.ArrayList;
import java.util.List;

public class BankING implements Bank{
    private List<Client> listOfClients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        sendNotiToNewClient(client);
        sendNotiToClients(client);
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
    public void sendNotiToNewClient(Client client) {
        String  kolega = " nowych kolegów";
        if (listOfClients.size() == 1) kolega = " nowego kolege";
        System.out.println(
                "Witaj " + client.getName() + " !" +
                        " Dzięki, że zaufałeś nam!");
        if (listOfClients.size() == 0) {
            System.out.println();
            return;
        }
        System.out.println(
                        "Masz " + listOfClients.size() + kolega +"\n"
        );
    }

    @Override
    public void sendNotiToClients(Client newClient) {
        for (Client client : listOfClients){
            if (client == newClient) continue;
            System.out.println(
                    "Wiadomość dla " + client.getName() + ":\n" +
                    "Hej " + client.getName() +
                    ", masz " + "1 nowego kolege" + ", w sumie masz ich już aż " + listOfClients.size() + "\n"
            );
        }
    }
}
