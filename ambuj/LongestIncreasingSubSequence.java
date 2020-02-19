import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line0 = reader.readLine();
        int noOfTestCases = Integer.valueOf(line0);
        for (int i = 0; i < noOfTestCases; i++) {
            String sizeOfArray = reader.readLine();
            int[] actualArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] resultant = new int[actualArray.length];
            int longestIncreasingSize = 0;
            for (int x : actualArray) {
                int startIdx = 0;
                int endIdx = longestIncreasingSize;

                //binary search should always be log n
                while (startIdx != endIdx) {
                    int midIdx = (startIdx + endIdx) / 2;
                    if (resultant[midIdx] < x)
                        startIdx = midIdx + 1;
                    else
                        endIdx = midIdx;
                }
                resultant[startIdx] = x;
                if (startIdx == longestIncreasingSize) {
                    longestIncreasingSize = longestIncreasingSize + 1;
                }
            }
            System.out.println(longestIncreasingSize);
        }

    }
}
