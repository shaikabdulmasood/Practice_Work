package ex;

import Day_3.Ex_Abstar_Remote;

public abstract class Remote {
	abstract void turnOn();
    abstract void turnOff();

}
class TVRemote extends Remote {
    void turnOn() {
        System.out.println("TV is turned ON");
    }
    void turnOff() {
        System.out.println("TV is turned OFF");
    }
}