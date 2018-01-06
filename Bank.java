package Bank2018;

import java.util.List;

public interface Bank {

    public void addClient(Client client);
    public void deleteClient(String name);
    public void addAccountToClient(Client client,String nameAccount);
    public void deleteAccountOfClient(Client client,String nameAccount);
    public List<Client> listAllClients();
    public void addMoneyToClientAccount(Client client, String nameAccount, int money);
    public void removeMoneyFromClientAccount(Client client, String nameAccount, int money);
    public void sendNotiToNewClient(Client client);
    public void sendNotiToClients(Client newClient);



}
