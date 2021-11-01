package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNot50ThenMinus1() {
        int[] data = {5, 4, 3, 2, 0, 9, 11, 15, 23, 20, 49, 33, 45, 60};
        int el = 50;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas31Then0() {
        int[] data = {5, 4, 3, 2, 0, 15, 55, 31, 8, 13, 89, 25};
        int el = 31;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        Assert.assertEquals(expected, result);
    }
}