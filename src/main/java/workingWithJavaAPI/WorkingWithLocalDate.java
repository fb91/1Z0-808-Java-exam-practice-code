package workingWithJavaAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WorkingWithLocalDate {
    public static void main(String[] args) {
        LocalDate lt = LocalDate.now();
        System.out.println("lt = " + lt);
        Period p = Period.ofDays(3);
        lt = lt.plus(p);
        System.out.println("lt = " + lt);
        StringBuilder sb = new StringBuilder("sasd");
        char a = 65;
        Double l = 3.0;

        LocalTime lt2 = LocalTime.of(22,10);
        lt2=lt2.truncatedTo(ChronoUnit.HALF_DAYS);
        System.out.println("lt2 = " + lt2);

        LocalDate ld = LocalDate.ofYearDay(2016,22);
        System.out.println("ld.getMonthValue() = " + ld.getMonthValue());

        LocalDate ld1 = LocalDate.of(2016, 3, 21);
        LocalDateTime ldt1 = ld1.atTime(10, 10);

        LocalDate ld2 = LocalDate.of(2020, 2, 27).plusDays(3);
        System.out.println("ld2.getMonth() = " + ld2.getMonth());

        LocalDate ld3 = LocalDate.of(2015,12,12);
//        LocalTime lt3 = ld3.atTime(10, 22);//Fails, it returns a LocalDateTime, not a LocalTime

        Year y = Year.of(2015);
//        LocalDate ld4 = y.atMonthDay(MonthDay.of(4,31)); //DateTimeException: Illegal value for
        // DayOfMonth field, value 31 is not valid for month APRIL
//        System.out.println("ld4 = " + ld4);

        LocalDate bornDate = LocalDate.of(1991,5,26);
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d' de 'MMM' de 'uuuu");
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME; // Used in localDateTime toString()
        DateTimeFormatter customDateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        System.out.println("bornDate.format(dateFormat) = " + bornDate.format(dateFormat));
        System.out.println("today.format(isoLocalDateTime) = " + today.format(isoLocalDateTime));
        System.out.println("today = " + today);
        System.out.println("today.format(customDateTimeFormat) = " + today.format(customDateTimeFormat));


        LocalDate aDate = LocalDate.of(2021,01,30);
        System.out.println("aDate = " + aDate); // 2021-01-30
        System.out.println("aDate.plusMonths(2) = " + aDate.plusMonths(2));// 2021-03-30
        System.out.println("aDate = " + aDate); // 2021-01-30, because it's immutable. plusMonths don't modify the localDate, it just creates a new one.

        //Tricky methods:
        System.out.println("aDate.plusMonths(1) = " + aDate.plusMonths(1));// 2021-02-28 February 30 doesn't exist, then it uses the last day of February.
        System.out.println("aDate.withMonth(2) = " + aDate.withMonth(2));// 2021-02-28 February 30 doesn't exist, then it uses the last day of February.
    }
}
