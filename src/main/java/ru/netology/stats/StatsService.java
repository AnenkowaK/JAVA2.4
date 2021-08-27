package ru.netology.stats;

public class StatsService {
    //Метод Номер месяца, в котором был минимум продаж
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

    //Метод Сумма всех продаж
    public long sumSales(long[] sales) {

        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //Метод Средняя сумма продаж в месяц
    public long averageSum(long[] sales) {

        long averageSum = sumSales(sales) / sales.length;


        return averageSum;
    }

    //Метод Номер месяца, в котором был пик продаж
    public int MaxSales(long[] sales) {

        int maxSaleMonth = 0;
        int numberMonth = 0;
        for (long sale : sales) {

            if (sale > sales[maxSaleMonth]) {
                maxSaleMonth = numberMonth;
            }
            numberMonth = numberMonth + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxSaleMonth + 1;
    }

    //Метод Кол-во месяцев, в которых продажи были ниже среднего
    public long monthSalesBelowAverage(long[] sales) {
        int numberMonth = 0;//Номер месяца с продажей ниже среднего
        long average = averageSum(sales);
                for (long sale : sales) {
            if (sale < average) {
                numberMonth = numberMonth + 1;
            }
        }

        return numberMonth;
    }

    //Метод Кол-во месяцев, в которых продажи были выше среднего
    public long monthSalesAboveAverage(long[] sales) {
        int numberMonth = 0;//Номер месяца с продажей выше среднего
        long average = averageSum(sales);
        for (long sale : sales) {
            if (sale > averageSum(sales)) {
                numberMonth = numberMonth + 1;
            }
        }
        return numberMonth;
    }


}
