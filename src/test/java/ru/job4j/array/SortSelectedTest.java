package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3815min10045ThenMin100354581() {
        int[] data = new int[] {3, 81, 5, -100, 45};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-100, 3, 5, 45, 81};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort99min1min2ThenMin2min199() {
        int[] data = new int[] {99, -1, -2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-2, -1, 99};
        Assert.assertArrayEquals(expected, result);
    }
}