package com.ambuj.practice.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArray {

    private int[] rotateArray(int[] arr, int size, int rotatingFactor) {
        int[] resultant = new int[size];
        for (int i = 0; i < size; i++) {
            if (i + rotatingFactor >= size) {
                resultant[i] = arr[i + rotatingFactor - size];
            } else {
                resultant[i] = arr[i + rotatingFactor];
            }
        }

        return resultant;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line0 = reader.readLine();
        int noOfTestCases = Integer.valueOf(line0);
        for (int i = 0; i < noOfTestCases; i++) {

            String line1 = reader.readLine();
            int arraySize = Integer.parseInt(line1.split(" ")[0]);
            int rotatingFactor = Integer.parseInt(line1.split(" ")[1]);
            int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            RotateArray rotateArray = new RotateArray();
            int[] result = rotateArray.rotateArray(inputArray, arraySize, rotatingFactor);
            for (int res : result) {
                System.out.print(res + " ");
            }
            System.out.println("");
        }
    }
}
