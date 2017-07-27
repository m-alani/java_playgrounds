package ca.alani;

import java.util.*;

public class Main {

    private static int B;
    private static int H;
    private static boolean flag = true;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if (B < 1 || H < 1) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag) {
            int area = B * H;
            System.out.println(area);
        }
    }//end of main

}//end of class

