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
public class FindingPrimes {
    public static void main(String [] args){
      for ( int i =2; i < 21; i++){
          if ( isPrime(i))
              System.out.println(i);
      }  
    }
    public static boolean isPrime( int n){
        for ( int i = 2; i<n; i++){
            if ( n%i == 0)
                return false;
        }
        return true;
    }
    
}
