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
public class MonthName {
    public static void main( String[] args ){

    System.out.println( "Month 1: " + month_name(1) );
    System.out.println( "Month 2: " + month_name(2) );
    System.out.println( "Month 3: " + month_name(3) );
    System.out.println( "Month 4: " + month_name(4) );
    System.out.println( "Month 5: " + month_name(5) );
    System.out.println( "Month 6: " + month_name(6) );
    System.out.println( "Month 7: " + month_name(7) );
    System.out.println( "Month 8: " + month_name(8) );
    System.out.println( "Month 9: " + month_name(9) );
    System.out.println( "Month 10: " + month_name(10) );
    System.out.println( "Month 11: " + month_name(11) );
    System.out.println( "Month 12: " + month_name(12) );
    System.out.println( "Month 43: " + month_name(43) );
    }
    
    public static String month_name(int num){
        
        if ( num == 1){
            return "January";
        }
        else if( num == 2){
            return "February";
        }
        else if( num == 3){
            return "March";
        }
        else if( num == 4 ){
            return"April";
        }
        else if( num == 5){
            return "May";
        }
        else if( num == 6 ){
            return "June";
        }
        else if( num == 7){
            return "July";
        }
        else if( num == 8){
            return "August";
        }
        else if( num == 9){
            return "September";
        }
        else if( num == 10){
            return "October";
        }
        else if( num == 11){
            return "November";
        }
        else if( num == 12 ){
            return "December";
        }
        else{
            return "Error";
        }
    }
}
    

