/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digixassesmentsection2q3.a;

/**
 *
 * @author Rocky
 */
public class DIGIXASSESMENTSECTION2Q3A {
// returns true if string is a palindrome 
    static boolean isPalindrome(String string) 
    {
        int i = 0, j = string.length() - 1; 
  
        while (i < j) { 
  
            if (string.charAt(i) != string.charAt(j)) 
                return false; 
  
            // Increase the first pointer and decrement the other 
            i++; 
            j--; 
        } 
  
        // returned string is a palindrome 
        return true; 
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String string = "tacocat"; 
  
        if (isPalindrome(string)) 
            System.out.print("true"); 
        else
            System.out.print("false"); 
        
    }
    
}
