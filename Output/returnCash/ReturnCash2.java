package cs586.Output.returnCash;

import cs586.ssaMain;

public class ReturnCash2 implements ReturnCash {

    @Override
    public void showReturnCash() {
        ssaMain.d2.returnC = ssaMain.d2.cash - ssaMain.d2.total;
        System.out.println("return cash: $" + String.format("%.2f", ssaMain.d2.returnC));
        System.out.println();
    }

}
