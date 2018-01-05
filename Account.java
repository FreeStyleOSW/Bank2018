package Bank2018;

public class Account {

    private String numberAccount;
    private String nameAccount;
    private int amount;
    public Account(String nameAccount) {
        this.nameAccount = nameAccount;
        this.amount = 0;
        this.numberAccount = RandomNumberAccount.getNumberAccount();
    }

    public int addMoney(int howmany){
        if (howmany<0){
            System.out.println("Wrong numberAccount!");
            return amount;
        }
        System.out.println("Cool! You add money to the account!");
        return amount+=howmany;
    }

    public int removeMoney(int howmany){
        if (amount - howmany > 0){
            System.out.println("Great! You spend money AGAIN !");
            return amount - howmany;
        }else{
            System.out.println("There are not enough money on the account!");
            return amount;
        }
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "numberAccount='" + numberAccount +'\'' +
                ", nameAccount='" + nameAccount + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}