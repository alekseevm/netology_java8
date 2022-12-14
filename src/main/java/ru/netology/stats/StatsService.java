package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int summSales(long[] sales) {
        int summ = 0;
        for (long sale : sales)
            summ += sale;
        return summ;
    }

    public int averageSales(long[] sales) {
        return summSales(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int averageMin(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                summ++;
            }
        }
        return summ;
    }


    public int averageMax(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                summ++;
            }
        }
        return summ;
    }
}


