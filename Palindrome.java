/*
File name: Palindrome.java
Add a number with it's reverse until it's a palindrome.
 */

package palindrome;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Palindrome {
//*********PROPERTY OF ALICIA RODRIGUEZ**********
    private static long reverse(long input)
    {//*********PROPERTY OF ALICIA RODRIGUEZ**********
        long reversed = 0;
        
        while(input != 0)
        {//*********PROPERTY OF ALICIA RODRIGUEZ**********
            reversed = reversed * 10 + input % 10;
            input = input/10;
        }
        
        return reversed;
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    
    public static void palindromeAddNumber(long input)
    {
        long count = 0;
        long reversed = reverse(input);
        long palindrome = 0;
        
        if(reversed != input) //check for initial input
        {
            palindrome = reverse(input) + input;
            count++;
            //*********PROPERTY OF ALICIA RODRIGUEZ**********
            while(palindrome != reverse(palindrome)) //check for other inputs
            {
                if(palindrome < 0)
                {
                    System.out.println(input 
                            + " can never be a palindrome.");
                    return;
                }
                palindrome = reverse(palindrome) + palindrome;
                count++;
            }//*********PROPERTY OF ALICIA RODRIGUEZ**********  
        }
        else
            palindrome = input;

        System.out.println("Count: " + count + " & " 
                + "Palindrome: " + palindrome);
        
    }//*********PROPERTY OF ALICIA RODRIGUEZ**********
    public static void main(String[] args) 
    {
        System.out.println("---Test Palindrome---\n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("What number would you like to test? ");
        long number = input.nextLong();
        
        System.out.println("--Result--");
        palindromeAddNumber(number);
     //*********PROPERTY OF ALICIA RODRIGUEZ**********   
    }
    //*********PROPERTY OF ALICIA RODRIGUEZ**********
}//end of Palindrome class definition
