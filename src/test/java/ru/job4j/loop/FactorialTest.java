package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 1;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialFor9Then362880() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        int n = 9;
        int result = Factorial.calc(n);
        int expected = 362880;
        Assert.assertEquals(expected, result);
    }
}