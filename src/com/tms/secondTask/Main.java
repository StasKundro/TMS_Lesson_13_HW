package com.tms.secondTask;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Получить дату следеющего вторника
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели (1-понедельник, 2-вторник...)");
        Integer dayOfWeek = in.nextInt()+1;
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);

        int days = dayOfWeek - weekday;
        if (days < 0) days += 7;
        now.add(Calendar.DAY_OF_YEAR, days);

        Date date = now.getTime();
        String nextDate = new SimpleDateFormat("E dd.MM.yyyy").format(date);
        System.out.println("Следующий(ая) " + nextDate);
    }
}
