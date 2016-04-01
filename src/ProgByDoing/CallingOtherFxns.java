package ProgByDoing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUMINA BFS
 */
public class CallingOtherFxns {
     public static void main(String [] args){
        int month = 3, day = 31, yy = 1994, rem, total;
        total = ( (yy - 1900)/4 ) + (yy - 1900);
        total += day;
        total += monthOffset.month_offset(month);
        
        if( WeekdayCalculator.isLeap(yy) && ( month == 1 || month == 2)){
            total -= 1;
        }
        rem = total%7;
        
        String myDay = ""; 
        myDay= WeekdayCalculator.weekday_name(rem);
        String Date = myDay + ", " + MonthName.month_name(month) + " " + day + ", " + yy;
        System.out.println(Date);
        
    }
    
    
    
}
