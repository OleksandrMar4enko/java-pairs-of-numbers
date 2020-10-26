package com.pairsOfNumbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DifferentPairs {

    public static Map<Integer, Integer> findPairs(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int s = arr[first] + arr[last];
            if (s == sum) {
                map.put(arr[first], arr[last]);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }
        return map;
    }
}
