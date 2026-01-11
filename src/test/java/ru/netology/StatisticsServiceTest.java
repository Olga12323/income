package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        Assertions.assertEquals(12, service.findMax(incomes));
    }

    @Test
    void findMaxWhenFirstIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {15, 12, 10, 8, 7};
        Assertions.assertEquals(15, service.findMax(incomes));
    }

    @Test
    void findMaxWhenLastIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 8, 10, 7, 15};
        Assertions.assertEquals(15, service.findMax(incomes));
    }

    @Test
    void findMaxWhenMiddleIsMax() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {5, 8, 12, 7, 9};
        Assertions.assertEquals(12, service.findMax(incomes));
    }

    @Test
    void findMaxWithAllEqual() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {10, 10, 10, 10};
        Assertions.assertEquals(10, service.findMax(incomes));
    }

    @Test
    void findMaxWithSingle() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7};
        Assertions.assertEquals(7, service.findMax(incomes));
    }

    @Test
    void findMaxWithNegative() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-10, -5, -8, -3};
        Assertions.assertEquals(-3, service.findMax(incomes));
    }

    @Test
    void findMaxWithMixed() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {-5, 0, 10, -3, 7};
        Assertions.assertEquals(10, service.findMax(incomes));
    }
}