package com.ambuj.practice.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KthSmallestElement {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line0 = reader.readLine();
        int noOfTestCases = Integer.valueOf(line0);
        for (int i = 0; i < noOfTestCases; i++) {
            int sizeOfArray = Integer.parseInt(reader.readLine());
            int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int k = Integer.parseInt(reader.readLine());

            Arrays.sort(inputArray);

            System.out.println(inputArray[k-1]);
        }
    }
}
