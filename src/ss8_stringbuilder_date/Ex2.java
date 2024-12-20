package ss8_stringbuilder_date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Ex2 {
    public static void main(String[] args) {
        // a
        String dateStr = "02/28/2023";
        Date date = new Date(dateStr);
        System.out.println("a: " + date);

        // b
        Date date2 = new Date(); //now
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date2));

        // c
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(dateStr, dtf);
        System.out.println(localDate);

        // d
        LocalDate localDate2 = LocalDate.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate2.format(dtf2));

        // e
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.printf("Hien tai: %d-%d-%d %d:%d:%d\n",
                localDateTime.getDayOfMonth(),
                localDateTime.getMonthValue(),
                localDateTime.getYear(),
                localDateTime.getHour(),
                localDateTime.getMinute(),
                localDateTime.getSecond()
        );

        // f
        LocalDate localDate3 = LocalDate.now();
        LocalDate localDate4 = localDate3.plusMonths(1);
        System.out.println("Them 1 thang: " + localDate4);
        System.out.println("Thu: " + localDate4.getDayOfWeek());
        System.out.println("So ngay chenh lech: " + localDate3.until(localDate4, ChronoUnit.DAYS));

        // g
        LocalDate localDate5 = LocalDate.now();
        LocalDate localDate6 = localDate5.minusDays(1000);
        System.out.println("Tru 1000 ngay: " + localDate6);

        // h
        String dateStr2 = "01/01/2020";
        String dateStr3 = "01/01/2021";
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate7 = LocalDate.parse(dateStr2, dtf3);
        LocalDate localDate8 = LocalDate.parse(dateStr3, dtf3);
        System.out.println("So ngay chenh lech: " + localDate7.until(localDate8, ChronoUnit.DAYS));

        // i
        String dateStr4 = "01/01/2024";
        int n = 1000;
        LocalDate localDate9 = LocalDate.parse(dateStr4, dtf3);
        LocalDate localDate10 = localDate9.plusDays(n);
        System.out.println("Them 1000 ngay: " + localDate10);
    }
}
