package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test//Номер месяца, в котором был минимум продаж
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        int minMonth = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(9, minMonth);
    }
    @org.junit.jupiter.api.Test//Сумма всех продаж
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        long sum = service.sumSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(180, sum);
    }
    @org.junit.jupiter.api.Test//Средняя сумма продаж
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // вызываем целевой метод:
        long averageSum = service.averageSum(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(15, averageSum);
    }


    @org.junit.jupiter.api.Test//Номер месяца с максимальной продажей
    void maxSalesCalculate() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод:
        long numberMonth = service.MaxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(6, numberMonth);
    }
    @org.junit.jupiter.api.Test//Кол-во месяцев с продажей ниже среднего
    void monthSalesBelowAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод:
        long numberMonth = service.monthSalesBelowAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(5, numberMonth);
    }

    @org.junit.jupiter.api.Test//Кол-во месяцев с продажей выше среднего
    void monthSalesAboveAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        // вызываем целевой метод:
        long numberMonth = service.monthSalesAboveAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(5, numberMonth);
    }


}
