/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digixassessmentsection2q2;

/**
 *
 * @author Rocky
 */

import java.util.Scanner;
public class DIGIXASSESSMENTSECTION2Q2 {
static int hcf(int a, int b) 
    { 
        if (a == 0) 
            return b; 
        return hcf(b % a, a); 
    } 
  
    // Function to find gcd of array of 
    // numbers 
    static int findHCF(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++){ 
            result = hcf(arr[i], result); 
  
            if(result == 1) 
            { 
               return 1; 
            } 
        } 
  
        return result; 
    } 
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int arr[] = { 2, 4, 6, 8, 10 }; 
        int n = arr.length; 
        System.out.println(findHCF(arr, n)); 
  
}
  
       
}
        
        
        
    
    

