package ca.alani;

import java.util.*;

public class Main {

    // Main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        for(int trip=0; trip<trips; trip++){
            // Read the inputs for this case
            int money = in.nextInt();
            int flavorCount = in.nextInt();
            int prices[] = new int[flavorCount];
            for (int flavor=0; flavor<flavorCount; flavor++) {
                prices[flavor] = in.nextInt();
            }

            // Find the output
            for (int i=0; i<flavorCount-1; i++) {
                for (int j=i+1; j<flavorCount; j++) {
                    if (prices[i] + prices[j] == money) {
                        System.out.print(i+1);
                        System.out.print(" ");
                        System.out.println(j+1);
                        i = flavorCount;
                        j = flavorCount;
                    }
                }
            }
        }
        in.close();
    }
}
