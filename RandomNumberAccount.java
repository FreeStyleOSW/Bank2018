package Bank2018;

import java.util.Random;

public class RandomNumberAccount {
    private String numberAccount ="";

    public String getNumberAccount(){
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            String nums = "";
            int y  = random.nextInt(10000);
            if (y < 10) {
                nums = "000" + y;
            }else if (9 < y && y < 100){
                nums = "00" + y;
            }else if (99 < y && y <1000){
                nums = "0" + y;
            }else {
                nums = String.valueOf(y);
            }
            numberAccount+=nums+" ";
            if (i == 5) numberAccount = numberAccount.substring(0,numberAccount.length()-1);
        }
        return numberAccount;
    }

}
