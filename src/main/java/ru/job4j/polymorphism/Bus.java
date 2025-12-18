package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус начинает движение.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Автобус вмещает 50 человек.");
    }

    @Override
    public int refuel(int fuel) {
        return fuel * Transport.PRICE;
    }
}
