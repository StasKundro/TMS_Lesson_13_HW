package com.tms.firstTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.*;

/**
 * Получить день недели по дате
 */

public class Main {

    public static List<String> days = Collections.unmodifiableList(Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"));

    public static String getDay(String day, String month, String year) {
        return LocalDate.parse(day + "-" + month + "-" + year, DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL_STANDALONE, Locale.ENGLISH);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день : __");
        String day = in.next();
        System.out.println("Введите месяц : __");
        String month = in.next();
        System.out.println("Введите год : ____");
        String year = in.next();
        System.out.println(getDay(day, month, year));
    }
}
