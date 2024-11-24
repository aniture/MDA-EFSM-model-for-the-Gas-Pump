package cs586.pumps;

import cs586.Data.data1;
import cs586.Data.data2;
import cs586.MDA_EFSM;
import cs586.ssaMain;

public class pump1 {
    public float tmp_a;
    public float tmp_b;
    public float tmp_cash;
    MDA_EFSM m = new MDA_EFSM();
    data1 d1;
    data2 d2;

    public void Activate(float a) {
        if ((a > 0) ) {
            ssaMain.tmp_a1 = a;

            tmp_a = a;

            m.Activate();
        }
    }

    public void Start() {
        m.Start();
    }

    public void PayCredit() {
        m.PayType(1);
    }

    public void Reject() {
        m.Reject();
    }

    public void Cancel() {
        m.Cancel();
    }

    public void Approved() {
        m.Approved();
    }

//    public void Super() {
//        m.SelectGas(2);
//    }

    public void PayCash(float c) {
        if (c > 0) {
            ssaMain.tmp_cash2 = c;

            tmp_cash = c;
            m.PayType(2);
        }
    }

    public void Regular() {
        m.SelectGas(1);
    }

    public void StartPump() {
        m.StartPump();
    }

    public void PumpGallon() {
        m.Pump();
    }

    public void StopPump() {
        m.StopPump();
        m.Receipt();
    }
}
