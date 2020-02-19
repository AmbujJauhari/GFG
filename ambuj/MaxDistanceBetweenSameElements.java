package com.ambuj.practice.gfg;

import java.util.HashMap;

public class MaxDistanceBetweenSameElements {

    public static void main(String[] args) {
        int result = 0;
        int[] inputArr = {};
        HashMap<Integer, Integer> firstIndexMap = new HashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (firstIndexMap.get(inputArr[i]) == null) {
                firstIndexMap.put(inputArr[i], i);
            } else {
                int length = i - firstIndexMap.get(inputArr[i]);
                if (length > result) {

                    result = length;
                }
            }
        }

        System.out.println(result);
    }
}
