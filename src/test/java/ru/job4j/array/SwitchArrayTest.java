package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to0() {
        int[] input = {1, 2, 3, 4, 5};
        int source = 4;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 2, 3, 4, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap6to2() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int source = 6;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 7, 3, 4, 5, 6, 2, 8};
        Assert.assertArrayEquals(expected, result);
    }
}