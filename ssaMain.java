package cs586;

import cs586.AbstractFactory.Pump_Factory;
import cs586.AbstractFactory.Pump_Factory1;
import cs586.AbstractFactory.Pump_Factory2;
import cs586.Data.data1;
import cs586.Data.data2;
import cs586.pumps.pump1;
import cs586.pumps.pump2;

import java.util.Scanner;


public class ssaMain {
    public static Pump_Factory pf;
    public static data1 d1;
    public static data2 d2;
    public static int ch;
    public static float tmp_a1;
    public static float tmp_b1;
    public static float tmp_a2;
    public static float tmp_b2;
    public static float tmp_c2;
    public static float tmp_cash2;


    public static void main(String[] args) {
        System.out.println("CS586 - Final Project - Spring 2024 ");
        System.out.println("Aditya Niture A20521495");
        System.out.println();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 for GPPump1");
            System.out.println("Press 2 for Pump2");
            System.out.println("Press 0 to quit from the program");
            System.out.println();
            System.out.println("Enter the value:");

            ch = scan.nextInt();
            if (ch == 0) {
                System.out.println("quiting from the program");
                System.out.println();
                break;
            } else {
                if (ch == 1) {
                    pump1 gp1 = new pump1();
                    pf = new Pump_Factory1();
                    d1 = new data1();
                    d2 = new data2();

                    float a;
                    float b;
                    float cash;
                    System.out.println();
                    System.out.println("      GasPump-1");
                    System.out.println("  MENU of Operations");
                    System.out.println();
                    System.out.println("   0. Activate(int)");
                    System.out.println("   1. Start()");
                    System.out.println("   2. PayCredit()");
                    System.out.println("   3. Reject()");
                    System.out.println("   4. Cancel()");
                    System.out.println("   5. Approved()");
                    System.out.println("   6. PayCash()");

                    System.out.println("   7. Pump()");
                    System.out.println("   8. PumpGallon()");
                    System.out.println("   9. StopPump()");
                    System.out.println("   111. Quit the program");
                    System.out.println("Please make a note of these operations");
                    System.out.println("   GasPump-1 Execution");
                    System.out.println();

                    while (ch != 111) {
                        System.out.println("  Select Operation:");
                        System.out.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved");
                        System.out.println("6-PayCash,7-Pump,8-PumpGallon,9-StopPump,111-Quit the program");

                        ch = scan.nextInt();
                        System.out.println();
                        switch (ch) {
                            case 0:
                                System.out.print("Operation:  Activate(int) ");
                                System.out.println();
                                System.out.print("Set the value of gas: ");
                                a = scan.nextFloat();
                                //System.out.print("Enter value of the b:");
                                // b = scan.nextFloat();
                                //System.out.print("aaaa:"+a);
                                //System.out.print("bbbbbbb:"+b);
                                gp1.Activate(a);
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 1:
                                System.out.print("Operation:  Start() ");
                                System.out.println();
                                gp1.Start();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Operation:  PayCredit()");
                                System.out.println();
                                gp1.PayCredit();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Operation:  Reject() ");
                                System.out.println();
                                gp1.Reject();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Operation:  Cancel() ");
                                System.out.println();
                                gp1.Cancel();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Operation:  Approved() ");
                                System.out.println();
                                gp1.Approved();
                                scan.nextLine();
                                System.out.println();
                                break;


                            case 6:
                                System.out.print("Operation:  PayCash()");
                                System.out.println();
                                System.out.print("Enter value of the cash: ");
                                cash = scan.nextFloat();
                                gp1.PayCash(cash);
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 12:
                                System.out.print("Operation:  Regular() ");
                                System.out.println();
                                gp1.Regular();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 7:
                                System.out.print("Operation: [] tempGasGPump()");
                                System.out.println();
                                gp1.Regular();
                                gp1.StartPump();
                                System.out.println();
                                break;

                            case 8:
                                System.out.print("Operation: PumpGallon()");
                                System.out.println();
                                gp1.PumpGallon();
                                System.out.println();
                                break;

                            case 9:
                                System.out.print("Operation: StopPump()");
                                System.out.println();
                                gp1.StopPump();
                                System.out.println();
                                break;
                        }
                    }
                } else if (ch == 2) {
                    pump2 gp2 = new pump2();
                    pf = new Pump_Factory2();
                    d2 = new data2();

                    System.out.println();
                    System.out.println("      GasPump-2");
                    System.out.println("  MENU of Operations");
                    System.out.println();
                    System.out.println("   0. Activate(float,float,float)");
                    System.out.println("   1. Start()");
                    System.out.println("   2. PayCash()");
                    System.out.println("   3. Cancel()");
                    System.out.println("   4. Diesel()");
                    System.out.println("   5. Regular()");
                    System.out.println("   6. Premium()");
                    System.out.println("   7. StartPump()");
                    System.out.println("   8. PumpGallon()");
                    System.out.println("   9. Stop()");
                    System.out.println("   10. Receipt()");
                    System.out.println("   11. NoReceipt");
                    System.out.println("   111. Quit the program");
                    System.out.println("Please make a note of these operations");
                    System.out.println("   GasPump-2 Execution");
                    System.out.println();

                    float a;
                    float b;
                    float c;
                    float cash;

                    while (ch != 111) {

                        System.out.println("     Select Operation:");
                        System.out.println("0-Activate,1-Start,2-PayCash,3-Cancel,4-Diesel,5-Regular,6-Premium");
                        System.out.println("7-StartPump,8-PumpGallon,9-Stop,10-Receipt,11-NoReceipt,111-quit");

                        ch = scan.nextInt();
                        System.out.println();
                        switch (ch) {
                            case 0:
                                System.out.print("Operation:  Activate(float,float,float) ");
                                System.out.println();
                                System.out.print("Set value of Diesel Gas:");
                                a = scan.nextFloat();
                                System.out.print("Set value of Regular Gas:");
                                b = scan.nextFloat();
                                System.out.print("Set value of Premium Gas:");
                                c = scan.nextFloat();
                                gp2.Activate(a, b, c);
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 1:
                                System.out.print("Operation:  Start() ");
                                System.out.println();
                                gp2.Start();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 2:
                                System.out.print("Operation:  PayCash()");
                                System.out.println();
                                System.out.print("Enter value of the cash: ");
                                cash = scan.nextFloat();
                                gp2.PayCash(cash);
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 3:
                                System.out.print("Operation:  Cancel() ");
                                System.out.println();
                                gp2.Cancel();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 4:
                                System.out.print("Operation:  Diesel() ");
                                System.out.println();
                                gp2.Diesel();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 5:
                                System.out.print("Operation:  Regular() ");
                                System.out.println();
                                gp2.Regular();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 6:
                                System.out.print("Operation:  Premium() ");
                                System.out.println();
                                gp2.Premium();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 7:
                                System.out.print("Operation:  StartPump() ");
                                System.out.println();
                                gp2.StartPump();
                                scan.nextLine();
                                System.out.println();
                                break;

                            case 8:
                                System.out.print("Operation: PumpGallon()");
                                System.out.println();
                                gp2.PumpLiter();
                                System.out.println();
                                break;

                            case 9:
                                System.out.print("Operation: Stop()");
                                System.out.println();
                                gp2.Stop();
                                System.out.println();
                                break;

                            case 10:
                                System.out.print("Operation: Receipt()");
                                System.out.println();
                                gp2.Receipt();
                                System.out.println();
                                break;

                            case 11:
                                System.out.print("Operation: NoReceipt()");
                                System.out.println();
                                gp2.NoReceipt();
                                System.out.println();
                                break;
                        }
                    }
                }
            }

        }
    }

}
