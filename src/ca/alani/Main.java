package ca.alani;

import java.util.*;

public class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int lineCount = 1;
        while (sc.hasNext()) {
            System.out.println(Integer.toString(lineCount++) + " " + sc.nextLine());
        }
    }
}
