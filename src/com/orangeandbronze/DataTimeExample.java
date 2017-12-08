package com.orangeandbronze;

import java.time.*;
import static java.time.temporal.ChronoUnit.*;
import static java.time.DayOfWeek.*;
import static java.time.Month.*;
import java.time.format.*;           // for TextStyle class
import java.util.*;                  // for Locale class

public class DataTimeExample {
  public static void main(String[] args) {
	  
    DayOfWeek dayOfWeek = MONDAY;
    System.out.println(dayOfWeek);  // MONDAY
    System.out.println("---------------------------------------");
    
    dayOfWeek = MONDAY.plus(3);
    System.out.println(dayOfWeek);
    System.out.println("---------------------------------------");
    
    dayOfWeek = MONDAY.minus(2);
    System.out.println(dayOfWeek);
    System.out.println("---------------------------------------");
    
    DayOfWeek day = MONDAY;
    Locale locale = Locale.getDefault();
    System.out.println(day.getDisplayName(TextStyle.FULL, locale));
    System.out.println(day.getDisplayName(TextStyle.NARROW, locale));
    System.out.println(day.getDisplayName(TextStyle.SHORT, locale));
    System.out.println("---------------------------------------");
    
    System.out.println(FEBRUARY.plus(2));
    System.out.println(FEBRUARY.minus(3));
    System.out.println("---------------------------------------");
    
    System.out.println(FEBRUARY.length(true));
    System.out.println(FEBRUARY.length(false));
    System.out.println("---------------------------------------");
    
    Month mo = FEBRUARY;
    Locale locale1 = Locale.getDefault();
    System.out.println(mo.getDisplayName(TextStyle.FULL, locale1));
    System.out.println(mo.getDisplayName(TextStyle.NARROW, locale1));
    System.out.println(mo.getDisplayName(TextStyle.SHORT, locale1));
    System.out.println("---------------------------------------");
    
    LocalDate today = LocalDate.now();
    System.out.println(today);
    System.out.println("---------------------------------------");
    
    LocalDate date = LocalDate.of(2015, DECEMBER, 2);
    System.out.println(date);
    System.out.println("---------------------------------------");
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
    LocalDate date1 = LocalDate.parse("12/02/15", formatter);
    System.out.println(date1);
    System.out.println("---------------------------------------");
    
    LocalDate date2 = LocalDate.of(2015, DECEMBER, 2);
    DayOfWeek dayOfWeek2 = date2.getDayOfWeek();
    System.out.println(dayOfWeek2);
    Month month = date.getMonth();
    System.out.println(month);
    System.out.println(date.getYear());       // int
    System.out.println(date.getDayOfMonth()); // int
    System.out.println(date.getDayOfYear());  // int
    System.out.println("---------------------------------------");
    
    LocalDate date3 = LocalDate.of(2015, DECEMBER, 2);
    System.out.println(date3.plusDays(5));    // 2015-12-07
    System.out.println(date3.plusWeeks(5));   // 2016-01-06
    System.out.println(date3.plusMonths(5));  // 2016-05-02
    System.out.println(date3.plusYears(5));   // 2020-12-02
    System.out.println(date3.minusDays(5));   // 2015-11-27
    System.out.println(date3.minusWeeks(5));  // 2015-10-28
    System.out.println(date3.minusMonths(5)); // 2015-07-02
    System.out.println(date3.minusYears(5));  // 2010-12-02
    System.out.println("---------------------------------------");
    
    LocalDate date4 = LocalDate.of(2015, DECEMBER, 2);
    System.out.println(date4.with(JULY));          // 2015-07-02
    System.out.println(date4.with(SUNDAY));        // Sunday after date 2015-12-06
    System.out.println(date4.withDayOfMonth(5));   // 2015-12-05
    System.out.println(date4.withMonth(5));        // 2015-05-02
    System.out.println(date4.withYear(1995));      // 1995-12-02
    System.out.println(date4.withDayOfYear(5));    // 2015-01-05
    System.out.println("---------------------------------------");
    
    LocalDate now = LocalDate.now();
    LocalDate date5 = LocalDate.of(2015, DECEMBER, 2);
    System.out.println(now.isBefore(date5));
    System.out.println(now.isAfter(date5));
    System.out.println(now.equals(date5));
    System.out.println("---------------------------------------");
    
    LocalDate date6 = LocalDate.of(2015, DECEMBER, 2);
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM/dd/yy");
    System.out.println(date6.format(f1)); 
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
    System.out.println(date6.format(f2));
    DateTimeFormatter f3 = DateTimeFormatter.ofPattern("eee MMM dd yyyy");
    System.out.println(date6.format(f3));
    DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    System.out.println(date6.format(f4));
    System.out.println("---------------------------------------");
    
    YearMonth ymNow = YearMonth.now();
    System.out.println(ymNow);  
    YearMonth jul05 = YearMonth.of(2005, JULY);
    System.out.println(jul05);
    System.out.println(jul05.isBefore(ymNow));
    System.out.println(jul05.isAfter(ymNow));
    System.out.println(jul05.plusMonths(3));
    System.out.println(jul05.minusMonths(3));
    System.out.println(jul05.plusYears(3));
    System.out.println(jul05.minusYears(3));
    System.out.println(jul05.with(MARCH));
    System.out.println(jul05.withYear(1995));
    System.out.println(jul05.isBefore(ymNow));
    System.out.println(jul05.isAfter(ymNow));
    System.out.println(jul05.equals(ymNow));
    System.out.println("---------------------------------------");
    
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMM yyyy");
    System.out.println(jul05.format(formatter1));
    YearMonth oct08 = YearMonth.parse("Oct 2008", formatter1);
    System.out.println(oct08);
    LocalDate birthday = oct08.atDay(15);
    System.out.println(birthday);
    LocalDate endOfOct08 = oct08.atEndOfMonth();
    System.out.println(endOfOct08);
    System.out.println("---------------------------------------");
    
    MonthDay today1 = MonthDay.now();
    System.out.println(today1);
    MonthDay feb29 = MonthDay.of(FEBRUARY, 29);
    System.out.println(feb29.isValidYear(2003));
    System.out.println(feb29.isValidYear(2004));
    System.out.println(feb29.getDayOfMonth());
    System.out.println(feb29.getMonth());
    System.out.println(feb29.isBefore(today1));
    System.out.println(feb29.isAfter(today1));
    System.out.println(feb29.with(APRIL));
    LocalDate feb29_08 = feb29.atYear(2008);
    System.out.println(feb29_08);   
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd");
    System.out.println(feb29.format(formatter2));
    MonthDay xmas = MonthDay.parse("12/25", formatter2);
    System.out.println(xmas);
    System.out.println("---------------------------------------");
    
    Year thisYear = Year.now();
    System.out.println(thisYear);
    System.out.println(thisYear.isLeap());
    LocalDate date100 = thisYear.atDay(100);
    System.out.println(date100);
    YearMonth novThisYear = thisYear.atMonth(NOVEMBER);
    System.out.println(novThisYear);
    Year y2k = Year.of(2000);
    System.out.println(y2k);
    System.out.println("---------------------------------------");
    
    System.out.println(LocalTime.now());
    System.out.println(LocalTime.MIDNIGHT);
    System.out.println(LocalTime.NOON);
    System.out.println(LocalTime.MIN);
    System.out.println(LocalTime.MAX);
    LocalTime breakfast = LocalTime.of(6, 15); // overloaded, see Javadoc
    System.out.println(breakfast);
    System.out.println(breakfast.getHour());
    System.out.println(breakfast.getMinute());
    System.out.println(breakfast.getSecond());
    System.out.println(breakfast.getNano());
    System.out.println("---------------------------------------");
    
    System.out.println(LocalDateTime.now());
    LocalDateTime birthMinute = LocalDateTime.of(1995, JULY, 10, 9, 45);
    System.out.println(birthMinute);
    LocalDate birthday1 = LocalDate.of(1995, JULY, 10);
    LocalTime birthTime = LocalTime.of(9, 45);
    LocalDateTime birthMinuteV2 = LocalDateTime.of(birthday1, birthTime);
    System.out.println(birthMinuteV2);
    System.out.println(birthMinuteV2.getYear());
    System.out.println(birthMinuteV2.getMonth());
    System.out.println(birthMinuteV2.getSecond());
    System.out.println(birthMinuteV2.getNano());
    System.out.println("---------------------------------------");
    
    ZonedDateTime now1 = ZonedDateTime.now();
    System.out.println(now1);
    System.out.println("---------------------------------------");
    
    ZoneId chicagoZone = ZoneId.of("America/Chicago");
    System.out.println(chicagoZone);
    ZonedDateTime nowChicago = ZonedDateTime.now(chicagoZone);
    System.out.println(nowChicago);

    ZonedDateTime nowHere = ZonedDateTime.now();
    ZoneId here = nowHere.getZone();
    System.out.println(here);
    System.out.println("---------------------------------------");
    
    ZoneId chicagoZone1 = ZoneId.of("America/Chicago"); 
    LocalDateTime chicagoLDT = LocalDateTime.of(2015, JUNE, 15, 9, 30);
    ZonedDateTime chicagoZDT = ZonedDateTime.of(chicagoLDT, chicagoZone1);
    System.out.println(chicagoZDT);
    ZoneId here1 = ZoneId.systemDefault();
    System.out.println(here1);
    ZonedDateTime hereZDT = chicagoZDT.withZoneSameInstant(here1);
    System.out.println(hereZDT);
    System.out.println("---------------------------------------");
    
    ZoneOffset india = ZoneOffset.of("+05:30");
    ZonedDateTime now2 = ZonedDateTime.now();
    System.out.println(now2);
    ZonedDateTime nowIndia = now2.withZoneSameInstant(india);
    System.out.println(nowIndia);
    System.out.println("---------------------------------------");
    
    OffsetTime hereNow = OffsetTime.now();
    System.out.println(hereNow);
    ZoneId tokyo = ZoneId.of("Asia/Tokyo");
    OffsetTime tokyoNow = OffsetTime.now(tokyo);
    System.out.println(tokyoNow);    
    System.out.println("---------------------------------------");
    
    Instant now3 = Instant.now();
    System.out.println(now3);    
    System.out.println("---------------------------------------");
    
    ZonedDateTime nowZDT = ZonedDateTime.now();
    System.out.println(nowZDT);
    System.out.println("---------------------------------------");
    
    Instant now4 = Instant.now();
    System.out.println(now);
    ZonedDateTime hereNow1 = now4.atZone(ZoneId.systemDefault());
    System.out.println(hereNow1);
    LocalDateTime localNow = hereNow1.toLocalDateTime();
    System.out.println(localNow);
    LocalTime localTime = hereNow1.toLocalTime();
    System.out.println(localTime);
    LocalDate localDate = localNow.toLocalDate();
    System.out.println(localDate);
    ZonedDateTime nowTokyo = ZonedDateTime.ofInstant(now4, ZoneId.of("Asia/Tokyo"));
    System.out.println(nowTokyo);
    System.out.println("---------------------------------------");
    
    Instant now5 = Instant.now();
    Instant then1 = now5.minus(10000, SECONDS); // 10k seconds before
    Duration duration = Duration.between(then1, now5);
    System.out.println(duration.getSeconds());
    System.out.println(duration.toMinutes());
    System.out.println(duration.toHours());
    System.out.println(duration.toDays());
    
    LocalTime then2 = LocalTime.of(4, 00); // 4am
    LocalTime now6 = LocalTime.now();
    Duration duration1 = Duration.between(then2, now6);
    System.out.println(duration1.getSeconds());	
    System.out.println(duration1.toMinutes());
    System.out.println(duration1.toHours());
    System.out.println(duration1.toDays());
    System.out.println("---------------------------------------");
    
    LocalDateTime then3= LocalDateTime.of(2015, JULY, 1, 11, 30);
    LocalDateTime now7 = LocalDateTime.now();
    Duration duration2 = Duration.between(then3, now7);
    System.out.println(duration2.getSeconds());
    System.out.println(duration2.toMinutes());
    System.out.println(duration2.toHours());
    System.out.println(duration2.toDays());

    LocalDateTime then4 = LocalDateTime.of(2015, JULY, 1, 11, 30);
    ZonedDateTime thereThen = ZonedDateTime.of(then4, ZoneId.of("Australia/Sydney"));
    ZonedDateTime hereNow2 = ZonedDateTime.now();
    Duration duration3 = Duration.between(thereThen, hereNow2);
    System.out.println(duration3.getSeconds());
    System.out.println(duration3.toMinutes());
    System.out.println(duration3.toHours());
    System.out.println(duration3.toDays());
    System.out.println("---------------------------------------");
    
    Instant now8 = Instant.now();
    System.out.println(now8);
    Duration tenMinutes = Duration.ofMinutes(10);
    Instant tenFromNow = now8.plus(tenMinutes);
    System.out.println(tenFromNow);
    
    LocalTime now9 = LocalTime.now();
    System.out.println(now9);
    Duration tenMinutes1 = Duration.ofMinutes(10);
    LocalTime tenMinutesAgo	 = now9.minus(tenMinutes1);
    System.out.println(tenMinutesAgo); 
  }
}
