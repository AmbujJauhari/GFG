package com.ambuj.practice.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class CountTheTriplet {
    private static int countTriplets(int[] inputArray, int arraySize) {
        int count = 0;
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < arraySize; i++) {
            elements.put(inputArray[i], i);
        }

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (elements.containsKey(inputArray[i] + inputArray[j])) {
                    count = count + 1;
                }
            }
        }

        if (count == 0) {
            return -1;
        } else {
            return count;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line0 = reader.readLine();
        int noOfTestCases = Integer.valueOf(line0);
        for (int i = 0; i < noOfTestCases; i++) {
            int arraySize = Integer.parseInt(reader.readLine());
            int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            System.out.println(countTriplets(inputArray, arraySize));
        }
    }
}
