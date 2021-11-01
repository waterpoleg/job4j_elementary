package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);

        names[0] = "Linus Torvalds";
        names[1] = "Martin Fowler ";
        names[2] = "James Gosling";
        names[3] = "Donald Knuth";

        for (String name: names) {
            System.out.println(name);
        }
    }
}
