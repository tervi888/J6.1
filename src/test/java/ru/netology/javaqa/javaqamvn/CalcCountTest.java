package ru.netology.javaqa.javaqamvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcCountTest {

    @Test
    public void shouldCalcCount() {

        CalcCount service = new CalcCount();

        int expected = 3;
        int actual = service.calculate(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcCount2() {

        CalcCount service = new CalcCount();

        int expected = 2;
        int actual = service.calculate(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

}
