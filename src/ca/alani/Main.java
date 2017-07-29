package ca.alani;

import java.util.*;
import java.security.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = Integer.parseInt(in.next()) - 1;
        int day = Integer.parseInt(in.next());
        int year = Integer.parseInt(in.next());

        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month, day);
        String weekdays[] = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println(weekdays[calendar.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
