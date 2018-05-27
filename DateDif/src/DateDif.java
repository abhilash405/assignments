/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class DateDif {

	public static void main(String[] args) {

		LocalDate startDate = LocalDate.of(2014, 03, 01);
		LocalDate endDate = LocalDate.of(2014, 06, 12);
		System.out.printf("%d days to go...%n", DAYS.between(startDate, endDate));

	}

}