package cs586.Output.pumpGasUnit;

import cs586.ssaMain;

public class PumpGasUnit1 implements PumpGasUnit {

    @Override
    public void showPumpGasUnit() {
        ssaMain.d1.gallon = ssaMain.d1.gallon + 1;
    }

}
