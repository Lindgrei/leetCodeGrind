package plusMinus;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int length = arr.size();
        double z =0, p = 0, n = 0;
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i) == 0){z++;} else if (arr.get(i)>0) {p++;}else if (arr.get(i)<0){n++;}

        }

        p = p / arr.size();
        n = n / arr.size();
        z = z / arr.size();
        System.out.format("%.6f", p);
        System.out.println();
        System.out.format("%.6f", n);
        System.out.println();
        System.out.format("%.6f", z);
        System.out.println();

    }

    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
 