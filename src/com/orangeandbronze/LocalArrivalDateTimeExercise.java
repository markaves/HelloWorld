package com.orangeandbronze;

import java.time.*;
import static java.time.Month.*;


public class LocalArrivalDateTimeExercise {
  public static void main(String[] args) {
    ZonedDateTime harareDeparture = ZonedDateTime.of(LocalDateTime.of(2015, DECEMBER, 1, 9, 15),ZoneId.of("Africa/Harare"));
    Duration harareFlightTime = Duration.ofHours(20);  
    LocalDateTime arrival = arrival(harareDeparture, harareFlightTime);
    System.out.println(arrival); 
  }
  
 static LocalDateTime arrival(ZonedDateTime departure, Duration flightTime) {
	 
   ZonedDateTime arrival = departure.plusHours(flightTime.toHours());
   ZonedDateTime local = arrival.withZoneSameInstant(ZoneId.systemDefault());
   return local.toLocalDateTime();   
 }
}
