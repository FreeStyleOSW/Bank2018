package Bank2018;

import java.util.List;

public interface Bank {

    public void addClient(Client client);
    public void deleteClient(String name);
    public void addAccountToClient(Client client,String nameAccount);
    public void deleteAccountOfClient(Client client,int idAccount);
    public List<Client> listAllClients();
    public void addMoneyToClientAccount(Client client, int idAccount, int cash);
    public void removeMoneyFromClientAccount(Client client, int idAccount, int cash);



}
