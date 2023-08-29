package ru.netology.services.vacation.services;

public class Vacation {
    int pocketMoney = 0;

    public int calculateMonthsForRest(int income, int expenses, int threshold) {
        int monthsForRest = 0;
        for (int months = 0; months < 12; months++) {
            if (pocketMoney >= threshold) { // отдых
                pocketMoney = (pocketMoney - expenses) / 3;
                monthsForRest++;
            } else {    // pocketMoney < threshold - работа
                pocketMoney += (income - expenses);
            }
        }
        return monthsForRest;
    }
}