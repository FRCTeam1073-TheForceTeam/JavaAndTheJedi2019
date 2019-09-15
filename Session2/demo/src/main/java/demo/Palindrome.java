package demo;

import java.util.*;
import java.util.stream.Stream;
import java.lang.String;
class Palindrome{

    public Palindrome(){

    }
    public String UserInput(){
        // read user input from stdin (console)
        Scanner userInput = new Scanner(System.in);//creates scanner object used for input
        System.out.println("enter string");
        String Palindrome = userInput.nextLine();//prompts user
        return Palindrome;
    }
    public Boolean IsPalindrome(String word){
        // do a test to determine if the input is a palindrome
        char input[] = word.toCharArray();
        int len = input.length;
        char[] output = new char[len];
        
        for(int j = len-1, i = 0; j > 0; j--, i++){
             output[i] = input[j];
        }

        String newWord = new String(output);
        Boolean isPalindrome = word.equals(newWord);

        return isPalindrome;
        
    }
}
