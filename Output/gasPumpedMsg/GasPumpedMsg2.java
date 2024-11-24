package cs586.Output.gasPumpedMsg;

import cs586.ssaMain;

public class GasPumpedMsg2 implements GasPumpedMsg {

    @Override
    public void showGasPumpedMsg() {
        System.out.println("Gas Pumped: " + ssaMain.d2.liter + " Gallons");
        System.out.println();
    }

}