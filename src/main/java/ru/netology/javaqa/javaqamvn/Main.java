package ru.netology.javaqa.javaqamvn;

public class Main {
    public static void main(String[] args) {

        CalcCount service = new CalcCount();
        int count = service.calculate(100000, 60000, 150000);
        System.out.println(count);

    }
}