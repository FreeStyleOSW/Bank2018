package Bank2018;

import java.util.ArrayList;
import java.util.List;

public class BankING implements Bank{
    private List<Client> listOfClients = new ArrayList<>();

    @Override
    public void addClient(Client client) {
        listOfClients.add(client);
    }

    @Override
    public void deleteClient(String name) {
        for (Client client: listOfClients){
            if (client.getName() == name){
                listOfClients.remove(client);
            }
        }
    }

    @Override
    public void addAccountToClient(Client client,String nameAccount) {
        client.getAccounts().add(new Account(nameAccount));
    }

    @Override
    public void deleteAccountOfClient(Client client, int idAccount) {
        for (Account account: client.getAccounts()){
            if (account.getIdAccount() == idAccount){
                client.getAccounts().remove(account);
            }
        }
    }

    @Override
    public List<Client> listAllClients() {
        return listOfClients;
    }

    @Override
    public void addMoneyToClientAccount(Client client, int idAccount, int cash) {
        for (Account account: client.getAccounts()){
            if (account.getIdAccount() == idAccount){
                account.addMoney(cash);
            }
        }
    }

    @Override
    public void removeMoneyFromClientAccount(Client client, int idAccount, int cash) {
        for (Account account: client.getAccounts()){
            if (account.getIdAccount() == idAccount){
                account.removeMoney(cash);
            }
        }
    }
}
