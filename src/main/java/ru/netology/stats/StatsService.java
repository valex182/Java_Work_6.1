package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] salePerMonth) {
        int sum = 0;
        for (int sale : salePerMonth) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverage(int[] salePerMonth) {
        return calculateSum(salePerMonth) / salePerMonth.length;
    }

    public int findMaxMonth(int[] salePerMonth) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : salePerMonth) {
            if (sale >= salePerMonth[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;

    }

    public int findMinMonth(int[] salePerMonth) {
        int minMonth = 0;
        int month = 0;
        for (int sale : salePerMonth) {
            if (sale <= salePerMonth[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findLessAverage(int[] salePerMonth) {
        int counter = 0;
        for (int sale : salePerMonth) {
            if (sale < calculateAverage(salePerMonth)) {
                counter++;
            }
        }
        return counter;
    }

    public int findMoreAverage(int[] salePerMonth) {
        int counter = 0;
        for (int sale : salePerMonth) {
            if (sale > calculateAverage(salePerMonth)) {
                counter++;
            }
        }
        return counter;
    }
}
