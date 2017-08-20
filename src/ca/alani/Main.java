package ca.alani;

import java.util.*;

public class Main {

    // Helper function to check if a string of brackets is balanced
    static String isBalanced(String s) {
        boolean good = true;
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            try {
                switch (c) {
                    case '}': good = (stack.pop() == '{'); break;
                    case ')': good = (stack.pop() == '('); break;
                    case ']': good = (stack.pop() == '['); break;
                    default: stack.push(c);
                }
            } catch (EmptyStackException e) {
                return "NO";
            }
            if (!good) {
                return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    // Main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a = 0; a < t; a++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
