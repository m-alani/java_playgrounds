package ca.alani;

import java.util.*;

public class Main {

    public static String getSmallestAndLargest(String s, int k) {
        int idx = k + 1;
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        while (idx < s.length()) {
            if (smallest.compareTo(s.substring(idx-k, idx)) < 0) {

            }
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
