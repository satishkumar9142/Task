package Logical_Exercise_12;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.function.Predicate;

public class DateUtil_12_14 {
	 public static String[] strMonths
     = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	 
	 public static String[] strdays
	 = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday",
			 "saturday"};
	 
	 public static int[] daysInMonths
     = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 
	 public static boolean isLeapYear(int year) { 
		 Predicate<Integer> pre = i -> i%4==0;
		 return pre.test(year);
	 }
	 public static boolean isValidDate(int year, int month, int day) {
		 if(year < 1 || year >9999) return false;
		 if(month < 1 || month > 12) return false;
		 if(day < 1 || day> 31) return false;
		 if(day == 31 && (month ==2|| month ==4 || month == 6 || month == 10 || month ==11 ))return false;
		 if(day == 30 && month == 2)return false;
		 if(day == 29 && !isLeapYear(year))return false;
		 return true;
	 }
	 
	 public static int getDayOfWeek(int year, int month, int day) {
		 Calendar cal = new GregorianCalendar(year, month -1, day);
		 int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
		 return dayNumber-1;
	 }
	 
	 public static String printDate(int year, int month, int day) {
		 String Cylinder = "";
		 Cylinder += strdays[getDayOfWeek(year, month, day)] + " ";
		 Cylinder += day + " ";
		 Cylinder += strMonths[month-1]+ " ";
		 Cylinder += year;
		 return Cylinder;
	 }

	 public static void main(String[] args) {
		 System.out.println(isLeapYear(1900));  // false
	      System.out.println(isLeapYear(2000));  // true
	      System.out.println(isLeapYear(2011));  // false
	      System.out.println(isLeapYear(2012));  // true
	 
	      System.out.println(isValidDate(2012, 2, 29));  // true
	      System.out.println(isValidDate(2011, 2, 29));  // false
	      System.out.println(isValidDate(2099, 12, 31)); // true
	      System.out.println(isValidDate(2099, 12, 32)); // false
	 
	      System.out.println(getDayOfWeek(1982, 4, 24));  // 6:Sat
	      System.out.println(getDayOfWeek(2000, 1, 1));   // 6:Sat
	      System.out.println(getDayOfWeek(2054, 6, 19));  // 5:Fri
	      System.out.println(getDayOfWeek(2012, 2, 17));  // 5:Fri
	 
	      System.out.println(printDate(2012, 2, 14));
	}
}
