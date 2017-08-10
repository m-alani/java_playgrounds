package ca.alani;

import java.util.*;

public class Main {

    static int[][] a;

    // Helper function to find the sum of an area
    static int findSum(int r, int c) {
        return (a[r][c] + a[r][c+1] + a[r][c+2] + a[r+1][c+1] + a[r+2][c] + a[r+2][c+1] + a[r+2][c+2]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        a = new int[6][6];

        // Read input
        for (int row=0; row<6; row++)
            for (int col=0; col<6; col++)
                a[row][col] = in.nextInt();

        // Find the solution
        int max = -64; // smallest allowed value for input is -9 times 7
        for (int row=0; row<4; row++)
            for (int col=0; col<4; col++) {
                int sum = findSum(row, col);
                if (sum > max)
                    max = sum;
            }

        // Print it out
        System.out.println(max);

        in.close();
    }

}
