package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int summSales(int[] sales1) {
        int summ = 0;
        for (int x : sales1)
            summ += x;
        return summ;
    }

    public int averageSales(int[] sales2) {
        int summ = 0;
        int average;
        for (int x : sales2)
            summ += x;
        average = summ / 12;
        return average;
    }

    public int maxSales(int[] sales3) {
        int maxMonth = 0;
        int month = 0;
        for (int x : sales3) {
            if (x >= sales3[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int averageMin(int[] sales4) {
        int summ = 0;
        int average;
        int averageMin = 0;
        for (int x : sales4)
            summ += x;
        average = summ / 12;
        for (int sale : sales4) {
            if (sale < average) {
                averageMin += 1;
            }
        }
        return averageMin;
    }

    public int averageMax(int[] sales5) {
        int summ = 0;
        int average;
        int averageMax = 0;
        for (int x : sales5)
            summ += x;
        average = summ / 12;
        for (int sale : sales5) {
            if (sale > average) {
                averageMax += 1;
            }
        }
        return averageMax;
    }
}


