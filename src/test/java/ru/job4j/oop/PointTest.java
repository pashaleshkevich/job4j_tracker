package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when500to3Minus57then8dot83() {
        double expected = 8.83;
        Point a = new Point(5, 0, 0);
        Point b = new Point(3, -5, 7);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1Minus48to136then7dot28() {
        double expected = 7.28;
        Point a = new Point(1, -4, 8);
        Point b = new Point(1, 3, 6);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}