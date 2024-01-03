package example1;

public class Leap_year {

   public static void main(String[] args) {
	   
	   int year = 2024;
	   
	boolean leapyear=( year%4==0);
	
	   leapyear= leapyear && (year%100!=0 || year%400==0);
	   
	   if(leapyear) {
		   System.out.println(year+"is a leap year");
	   }
	   else {
		   System.out.println(year+"is not a leap year");
	   }
	   }
   }

