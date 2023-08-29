package ru.netology.services.vacation.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationTest {

    @Test
    void Ex1() {
        Vacation service = new Vacation();

        int expected = 3;

        int actual = service.calculateMonthsForRest(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев для отдыха: " + actual);
    }

    @Test
    void Ex2() {
        Vacation service = new Vacation();

        int expected = 2;

        int actual = service.calculateMonthsForRest(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев для отдыха: " + actual);
    }

    /*@Test
    void alwaysRest() {
        Vacation service = new Vacation();

        int expected = 12;

        int actual = service.calculateMonthsForRest(1, 0, 0);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев для отдыха: " + actual);
    }

    @Test
    void alwaysWork() {
        Vacation service = new Vacation();

        int expected = 0;

        int actual = service.calculateMonthsForRest(1, 1, 10);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев для отдыха: " + actual);
    }*/
}
