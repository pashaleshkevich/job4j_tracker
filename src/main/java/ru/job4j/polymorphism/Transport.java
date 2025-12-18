package ru.job4j.polymorphism;

public interface Transport {
    int PRICE = 50;

    void move();

    void passengers(int count);

    int refuel(int fuel);
}
