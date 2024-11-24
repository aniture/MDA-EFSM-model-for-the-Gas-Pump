package cs586.Output.displayMenu;

import cs586.ssaMain;


public class DisplayMenu2 implements DisplayMenu {

    @Override
    public void showMenu() {
        System.out.println("Please Select Gas Type");
        System.out.println("Diesel: $" + ssaMain.d2.a);
        System.out.println("Regular: $" + ssaMain.d2.b);
        System.out.println("Premium: $" + ssaMain.d2.c);
        System.out.println();

    }

}
