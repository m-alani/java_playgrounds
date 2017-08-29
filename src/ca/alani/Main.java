package ca.alani;

import java.util.*;

public class Main {

    // Insertion function - Insertion Sort I
    public static void insertIntoSorted(int[] ar) {
        int inserted = ar[ar.length - 1];
        boolean sorted = false;
        int index = ar.length - 1;
        while (!sorted && index > 0) {
            if (ar[index - 1] > inserted) {
                ar[index] = ar[index - 1];
                printArray(ar);
                index--;
            } else {
                ar[index] = inserted;
                sorted = true;
            }
        }
        if (!sorted) {
            ar[index] = inserted;
        }
        printArray(ar);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
