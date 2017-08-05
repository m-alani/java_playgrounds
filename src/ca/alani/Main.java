package ca.alani;

import java.util.*;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int index = 0;
        int length = input.length();
        int range = length / 2;
        while (index <= range && input.charAt(index) == input.charAt(length - index - 1)) {
            index++;
        }
        System.out.println((index > range) ? "Yes" : "No");
        in.close();
    }
    
}
