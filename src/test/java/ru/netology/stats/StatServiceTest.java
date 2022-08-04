package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void shouldFindMinMonth() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 9;
        int actualDay = service.minSales(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void shouldFindSumm() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.summSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(month);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinAverage() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.averageMin(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverage() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.averageMax(month);

        Assertions.assertEquals(expected, actual);
    }
}
