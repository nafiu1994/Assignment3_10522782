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
public class Eveness {
    public static void main(String [] args){
        for ( int i = 1; i <= 20; i++){
            if ( isEven(i) && isDivisibleBy3(i)){
                System.out.println(i  + "<=");
            }
            else if ( isEven(i)){
                System.out.println(i  + "<");
            }
            else if ( isDivisibleBy3(i)){
                System.out.println(i  + "=");               
            }
            else{
                System.out.println(i);
            }
                
            
        }
    }
    public static boolean isEven( int n){
        if( n%2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isDivisibleBy3( int n){
        if ( n%3 == 0){
            return true;
        }
        return false;
    }
    
}
