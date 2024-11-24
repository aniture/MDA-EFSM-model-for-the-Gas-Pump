package cs586.Output.gasPumpedMsg;

import cs586.ssaMain;

public class GasPumpedMsg1 implements GasPumpedMsg {

    @Override
    public void showGasPumpedMsg() {
        System.out.println("Gas Pumped: " + ssaMain.d1.gallon + " Gallons");
        System.out.println();

    }

}
