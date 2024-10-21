package datesAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Dates {


public static void howManyDaysPassedFromBirthday() {
    //  1. Порахуй скільки днів прожила

        LocalDate startDate = LocalDate.of(1988, 10, 12);
        LocalDate endDate = LocalDate.of(2024, 8, 6);

        Period period = Period.between(startDate, endDate);

        // System.out.println("days: " + startDate.until();3

        long p = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.printf("days: %d", p);
}

public static void howManyMonthsPassedFromBirthday() {
// Порахуй скільки місяців ще проживеш, якщо будеш жити до 100 років

        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2088, 10, 12);

        Period period = Period.between(startDate, endDate);

        System.out.printf("Left months till 100 years: %d", period.toTotalMonths());
}

public static void howManyMinutesChildrenAreLeavingFromBirthday() {
//  3. Порахуй скільки діти прожили хвилин кожен

        LocalDateTime startDate = LocalDateTime.now();
        LocalDateTime endDate = LocalDateTime.of(2019, 6, 4, 10, 20);
        LocalDateTime endDate1 = LocalDateTime.of(2019, 6, 4, 10, 21);

        Duration duration = Duration.between(endDate, startDate);
        Duration duration1 = Duration.between(endDate1, startDate);

        long minutesLidia = duration.toMinutes();
        long minutesAlina = duration1.toMinutes();

        System.out.printf("Lidia lives %d minutes", minutesLidia);
        System.out.printf("Alina lives %d minutes", minutesAlina);
}

public static void howManyYearsPassedFromDiscoveringAmerica() {
// Порахуй скільки років минуло з відкриття америки Колумбом

        LocalDate startDate = LocalDate.of(1492, 10, 12);
        LocalDate endDate = LocalDate.now();

        Period period = Period.between(startDate, endDate);
        System.out.printf("%d years have passed since Columb discover America", period.getYears());
}

    public static void dateOfBirthdaysArrayOfSomePeople() {
//  Створити масив дат днів народжень якихось людей. І порахуй середню дату їх народження

        LocalDate[] birthdays = new LocalDate[5];

        birthdays[0] = LocalDate.of(1946, 8, 16);
        birthdays[1] = LocalDate.of(2019, 6, 4);
        birthdays[2] = LocalDate.of(2019, 6, 4);
        birthdays[3] = LocalDate.of(1986, 6, 11);
        birthdays[4] = LocalDate.of(2008, 3, 7);

        Period period = Period.of(0, 0, 0);

        int y = 0;
        int m = 0;
        int d = 0;
        for (int i = 0; i < birthdays.length; i++) {
            y = y + birthdays[i].getYear();
        //    period = period.plusMonths(birthdays[i].getMonth().getValue()); // .getValue() izmenit .getMonth() v chislo
            m = m + birthdays[i].getMonth().getValue();
            d = d + birthdays[i].getDayOfMonth();
         //   period = period.plusDays(birthdays[i].getDayOfMonth());
        }
        System.out.printf("%d, %d, %d", y/ birthdays.length,m/ birthdays.length,d/ birthdays.length);

//// long d = ChronoUnit.DAYS.between(startDate, endDate);
////        long d = 0;
//
//        for (int i = 0; i < birthdays.length; i++) {
//            d = d + ChronoUnit.DAYS.between(LocalDate.of (0,1,1), birthdays[i]);
//        }
//
//        d = d /birthdays.length;
//        period = Period.ofDays((int)d);
//        LocalDate date = (LocalDate) period.addTo (LocalDate.of(0, 1, 1));
//        System.out.println(date);
    }
}
