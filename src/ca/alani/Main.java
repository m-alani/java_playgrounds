package ca.alani;

import java.util.*;

public class Main {

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
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
