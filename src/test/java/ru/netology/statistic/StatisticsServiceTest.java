package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;


        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNew() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 8, 4, 5, 3, 21, 6, 12, 11, 12, 12};
        long expected = 21;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void findMaxIfNegative (){
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        long expected = -3;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfZero() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {0, 0, 0, 0, 0, 0};
        long expected = 0;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void findMaxIfMaxEnd (){
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
        long expected = -3;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);

    }
}