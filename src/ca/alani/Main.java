package ca.alani;

import java.util.*;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        int idx = k + 1;
        while (idx <= s.length()) {
            String temp = s.substring(idx-k, idx);
            if (smallest.compareTo(temp) > 0) {
                smallest = temp;
            } else if (largest.compareTo(temp) < 0){
                largest = temp;
            }
            idx++;
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
