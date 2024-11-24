package cs586.Output.storeCash;

import cs586.ssaMain;


public class StoreCash1 implements StoreCash {

    @Override
    public void showStoreCash() {
        ssaMain.d2.cash = ssaMain.tmp_cash2;
        System.out.println("Your Cash saved");
        System.out.println();

    }

}
