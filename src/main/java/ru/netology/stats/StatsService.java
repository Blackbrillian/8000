package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;

    }

    public long montMaximumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public long montMinimumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i > sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month - 1;
    }

    public long montBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public long montAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);

        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}


