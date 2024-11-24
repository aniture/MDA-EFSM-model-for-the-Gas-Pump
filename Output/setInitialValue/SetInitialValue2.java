package cs586.Output.setInitialValue;

import cs586.ssaMain;

public class SetInitialValue2 implements SetInitialValue {

    @Override
    public void showSetInitialValue() {
        ssaMain.d2.liter = 0;
        ssaMain.d2.total = 0;
        System.out.println("Gallons=0 and total=0 ");
        System.out.println();

    }

}
