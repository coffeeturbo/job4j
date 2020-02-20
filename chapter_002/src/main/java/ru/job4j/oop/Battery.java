package ru.job4j.oop;

public class Battery {
    private int load;

    public int getLoad() {
        return load;
    }

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery newBattery = new Battery(10);
        Battery oldBattery = new Battery(5);
        newBattery.exchange(oldBattery);
        System.out.println("Old battery charged to " + oldBattery.getLoad());
        System.out.println("new battery empty to " + newBattery.getLoad());
    }
}
