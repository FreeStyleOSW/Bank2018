package Bank2018;

public class Test {
    public static void main(String[] args) {
        BankING bankING = new BankING();
        Client client1 = new Client("Marcin","Stażyński","cos@cos.pl",510324999);
        Client client2 = new Client("Krzysztof","Wolański","kupa@cos.pl",729333244);
        bankING.addAccountToClient(client1,"Pierwsze");
        bankING.addAccountToClient(client1,"Drugie");
        bankING.addAccountToClient(client2,"Pierwsze");
        bankING.addAccountToClient(client2,"Drugie");
        bankING.addMoneyToClientAccount(client1,"Pierwsze",1500);
        bankING.addMoneyToClientAccount(client1,"Drugie",200);
        bankING.addMoneyToClientAccount(client2,"Pierwsze",1500);
        bankING.addMoneyToClientAccount(client2,"Drugie",200);
        bankING.addClient(client1);
        bankING.addClient(client2);
        System.out.println(bankING.listAllClients());
        bankING.deleteAccountOfClient(client1,"Drugie");
        bankING.removeMoneyFromClientAccount(client1,"Pierwsze",30);
        System.out.println(bankING.listAllClients());
        bankING.removeMoneyFromClientAccount(client2,"Pierwsze",50000);
    }
}
