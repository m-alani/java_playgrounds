package ca.alani;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // read the input
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();

        // print the output
        System.out.println(first.length() + second.length());
        System.out.println((first.compareTo(second) > 0) ? "Yes" : "No");

        System.out.print(first.substring(0,1).toUpperCase().concat(first.substring(1)));
        System.out.print(" ");
        System.out.println(second.substring(0,1).toUpperCase().concat(second.substring(1)));
    }
}
