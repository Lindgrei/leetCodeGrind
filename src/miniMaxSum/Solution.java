    package miniMaxSum;

    import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.function.*;
    import java.util.regex.*;
    import java.util.stream.*;
    import static java.util.stream.Collectors.joining;
    import static java.util.stream.Collectors.toList;

    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            int sum = 0;
            int max = 0;
            int min =0;
            for (int i =0; i < arr.size(); i++){

                sum+=arr.get(i);
            }

            int s1 = sum - arr.get(0);
            int s2 = sum - arr.get(1);
            int s3 = sum - arr.get(2);
            int s4 = sum - arr.get(3);
            int s5 = sum - arr.get(4);

            ArrayList<Integer> search = new ArrayList<>();
            search.add(s1);search.add(s2);search.add(s3);search.add(s4);search.add(s5);


           Collections.sort(search);
           min = search.get(0);
           max = search.get(4);

            System.out.print(min+" "+max);




        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.miniMaxSum(arr);

            bufferedReader.close();
        }
    }
