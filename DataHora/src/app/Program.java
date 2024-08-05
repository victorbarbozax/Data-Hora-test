package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		//INSTANCIACAO
		LocalDate d04 = LocalDate.parse("2022-07-20"); 
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); 
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); 

		//past next
		//LocalDate: minus, plus
		//LocalDateTime:  minus, plus
		//Instant: ^ + ChronoUnit.D
		//Duration: .between     t1: atStartOfDay
		
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
	       	LocalDate nextWeekLocalDate = d04.plusDays(0);
		
		         System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		               System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		  System.out.println();
		
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
	    	LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		       System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		             System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		    
		    System.out.println();
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS) ; 
		   Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS) ;
		
		          System.out.println("pastWeekInstant = " + pastWeekInstant);
		                System.out.println("nextWeekInstant = " + nextWeekInstant);
		        
		    System.out.println();   
		       
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay()) ;      
		       Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		              Duration t3 = Duration.between(pastWeekInstant, d06);
		                     Duration t4 = Duration.between(d06, pastWeekInstant);
		       
		 System.out.println("t1 Days = " + t1.toDays());      
		       System.out.println("t2 Days = " + t2.toDays());
		             System.out.println("t3 Days = " + t3.toDays());
		                   System.out.println("t4 Days = " + t4.toDays());
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
	}

}
