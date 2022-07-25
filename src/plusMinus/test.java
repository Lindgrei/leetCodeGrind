package plusMinus;

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

import static java.util.stream.Collectors.toList;

class test {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.toArray().length;
        if (0<n && n<=100){
            int zeros = 0;
            int pos = 0;
            int neg = 0;
            for (int i = 0; i < arr.toArray().length; i++){
                if (arr.get(i) == 0){zeros++;} else if (arr.get(i)>0) {pos++;}else{neg++;}

            }

            double zeroRatio = zeros/n;
            double posRatio = pos/n;
            double negRatio = neg/n;
            System.out.println(zeroRatio);
            System.out.println(posRatio);
            System.out.println(negRatio);
        }
    }

    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);al.add(1);
        System.out.println(al.toArray().length);
    }
}


