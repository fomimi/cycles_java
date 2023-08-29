package ru.netology.services.vacation.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    void Ex1(int expected, int income, int expenses, int threshold) {
        Vacation service = new Vacation();

        //int expected = 3;

        int actual = service.calculateMonthsForRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
        System.out.println("Количество месяцев для отдыха: " + actual);
    }

}
