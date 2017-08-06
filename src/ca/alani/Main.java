package ca.alani;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    static int minSteps(String B){
        int steps = 0;
        int index = B.indexOf("010");
        while (index != -1) {
            steps++;
            index = B.indexOf("010", index + 3);
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextInt();
        String B = in.next();
        int result = minSteps(B);
        System.out.println(result);
        in.close();
    }
    
}
