package cs586.Output.setPrice;

import cs586.ssaMain;

public class SetPrice2 implements SetPrice {

    @Override
    public void showSetPrice(int g) {
        if (g == 1) {
            ssaMain.d2.price = ssaMain.d2.a;
            System.out.println(" Gas Price setted");
            System.out.println();
        }
        if (g == 2) {
            ssaMain.d2.price = ssaMain.d2.b;
            System.out.println(" Gas Price setted");
            System.out.println();
        }
        if (g == 3) {
            ssaMain.d2.price = ssaMain.d2.c;
            System.out.println(" Gas Price setted");
            System.out.println();
        }
        //else{
        //	System.out.println("You can only select Regular or Super or Premium");
        //	System.out.println();
        //}

    }

}
