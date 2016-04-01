package ProgByDoing;

/**
 *
 * @author Lawal Nafiu
 */

public class WeekdayCalculator {
    public static void main(String [] args){
        int month = 12, day = 10, yy = 2003, rem, total;
        total = ( (yy - 1900)/4 ) + (yy - 1900);
        total += day;
        total += monthOffset.month_offset(month);
        
        if(isLeap(yy) && ( month == 1 || month == 2)){
            total -= 1;
        }
        rem = total%7;
        
        String myDay = ""; 
        myDay= weekday_name(rem);
        String Date = myDay + ", " + MonthName.month_name(month) + " " + day + ", " + yy;
        System.out.println(Date);
        
    }
    public static Boolean isLeap(int yr){
        if( ( yr%4 == 0) && ( yr%100 !=0 || yr%400 == 0)){
            return true;
        }
        return false;
    }
    public static String weekday_name( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}
		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
                else if ( weekday == 4 )
		{
			result = "Wednesday";
		}
                else if ( weekday == 5 )
		{
			result = "Thursday";
		}
                else if ( weekday == 6 )
		{
			result = "Friday";
		}
                else if ( weekday == 7 )
		{
			result = "Saturday";
		}
                else if ( weekday == 0 )
		{
			result = "Saturday";
		}
                else
                {
                        result = "error";
                }
		return result;
	}
    
}
