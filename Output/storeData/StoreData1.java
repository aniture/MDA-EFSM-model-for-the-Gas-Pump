package cs586.Output.storeData;

import cs586.ssaMain;


public class StoreData1 implements StoreData {
    @Override
    public void saveData() {
        ssaMain.d1.a = ssaMain.tmp_a1;
        ssaMain.d1.b = ssaMain.tmp_b1;
        System.out.println("Gas Price Updated");
        System.out.println();
    }

}
