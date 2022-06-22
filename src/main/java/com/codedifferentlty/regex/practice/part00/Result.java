package com.codedifferentlty.regex.practice.part00;

public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        // Write your code here
        int aCount = 0;
        int secondACount = 0;
        long total;
        long wholeCount = n / s.length();
        long remainder = n % s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }
        long wholeAOccurrences = aCount * wholeCount;
        if (remainder == 0) {
            total = wholeAOccurrences;
        } else {
            String sub = s.substring(0, (int) remainder);
            for (int i = 0; i < sub.length(); i++) {
                secondACount++;
            }
            total = wholeAOccurrences + secondACount;
        }
        return total;
    }
}
