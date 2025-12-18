package ru.job4j.tracker;

/*
    Определять работу класса по получению данных от пользователя в консоли
 */
public interface Input {

    String askStr(String question);

    int askInt(String question);
}
