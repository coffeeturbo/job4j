package ru.job4j.poly;

public class Bus implements Transport {
    private int passengers;
    private int fuel;

    @Override
    public void drive() {

    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public int fillUp(int fuel) {
        int fuelPrice = 10;
        this.fuel = fuel;

        return fuel * fuelPrice;
    }
}
