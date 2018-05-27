/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoned;
    import java.time.ZoneId;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 *
 * @author Abhilash
 */
public class Zoned {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

		ZonedDateTime india=ZonedDateTime.of(2018, 01,02,12,0,0,0,ZoneId.of("Europe/Paris"));
		ZonedDateTime chicago=ZonedDateTime.of(2018, 01,15,12,0,0,0,ZoneId.of("America/Chicago"));
		Duration d=Duration.between(india, chicago);
		System.out.println(india);
		System.out.println(chicago);
	    System.out.println(d);
            System.out.printf("%d days to go...%n", DAYS.between(india, chicago));
	  }
	}

   
