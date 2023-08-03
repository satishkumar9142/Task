package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DateAndTimeApi {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		int dd = date.getDayOfMonth();
		int mm = date.getDayOfMonth();
		int yyyy = date.getYear();
		System.out.println(dd + "--" + mm + "--" + yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();
		
		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();
		
		System.out.printf("%d:%d:%d:%d",h,m,s,n);
		System.out.println();
		LocalDateTime ldt = LocalDateTime.of(2000, 10, 27, 3, 20);
		System.out.println(ldt);
		
		System.out.println("After Six Month =" + ldt.plusMonths(6));
		System.out.println("Before twelve Month =" + ldt.minusMonths(12));
		
		// period
		LocalDate birthday = LocalDate.of(2000, 10, 27);
		LocalDate today = LocalDate.now();
		
		Period p = Period.between(birthday, today);
		System.out.println(p);
		System.out.printf("your age is %d years %d months and %d Days",p.getYears(),p.getMonths(),p.getDays());
		
		LocalDate deathDay = LocalDate.of(2060, 10, 27);
		Period p1 = Period.between(today, deathDay);
		int d = p1.getYears()*365 + p1.getMonths()*30 + p1.getDays();
		System.out.printf("\n you will be on earth only %d days, Hurry up to do more important things",d);	
	
		System.out.println();
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter year Number");
		int y = sc.nextInt();
		Year year = Year.of(y);
		if(year.isLeap()) {
			System.out.printf("%d year is Leap year",y);
		}else
		{
			System.out.printf("%d year is Not Leap year",y);
		}
		 */
		ZoneId zone =ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt = ZonedDateTime.now(la);
		System.out.println(dt);
	}
}
/*
     java 8 feature local date time feature in 
  
 
  
  
 */

