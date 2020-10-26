package com.pairsOfNumbers;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        int[] array = new int[12];
        final int sum = 12;

        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 20));
        }

        Map<Integer, Integer> pairs = DifferentPairs.findPairs(array, sum);
        for (Map.Entry entry : pairs.entrySet()) {
            int s = (Integer) entry.getKey() + (Integer) entry.getValue();
            System.out.println(entry.getKey() + " + " + entry.getValue() + " = " + s);
        }
    }

}
