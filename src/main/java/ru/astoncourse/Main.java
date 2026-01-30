package ru.astoncourse;


import dao.CardDao;

public class Main {
    public static void main(String[] args) {
        CardDao cardDao = new CardDao();
        cardDao.findById();
    }
}