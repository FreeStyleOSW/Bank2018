package Bank2018;

import java.util.Random;
import java.util.RandomAccess;

public class Account {
    private String numberAccount;
    private String nameAccount;
    private int amount;
    private RandomNumberAccount randomNumberAccount = new RandomNumberAccount();

    public Account(String nameAccount) {
        this.nameAccount = nameAccount;
        this.amount = 0;
        this.numberAccount = randomNumberAccount.getNumberAccount();
    }

    public int addMoney(int howmany){
        if (howmany<0){
            System.out.println("Wrong numberAccount!");
            return amount;
        }
        System.out.println("Cool! You add money to the account!");
        return amount += howmany;
    }

    public int removeMoney(int howmany){
        if (this.amount - howmany > 0){
            System.out.println("Oh Nooo! You spend money!");
            return amount -= howmany;
        }else{
            System.out.println("There are not enough money on the account!");
            return amount;
        }
    }

    public String getNumberAccount() {
        return numberAccount;
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

    @Override
    public String toString() {
        return "Account{" +
                "nameAccount='" + nameAccount + '\'' +
                ", numberAccount='" + numberAccount +'\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
