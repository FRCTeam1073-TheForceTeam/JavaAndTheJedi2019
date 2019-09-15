package demo;

import java.util.*;
import java.util.stream.Stream;
import java.lang.String;
class Palindrome{

    public Palindrome(){

    }
    public String UserInput(){
        Scanner userInput = new Scanner(System.in);//creates scanner object used for input
        System.out.println("enter string");
        String Palindrome = userInput.nextLine();//prompts user
        return Palindrome;
    }
    public Boolean IsPalindrome(String word){
        System.out.println(word);
        String currentChar;
        char input[] = word.toCharArray();
        int len = input.length;
        char[] output = new char[len];
        
        for(int j = len-1, i = 0; j >= 0; j--, i++){
             output[i] = input[j];
        }
        String newWord = new String(output);
        System.out.println(newWord);
        Boolean isPalindrome = word.equals(newWord);
        return isPalindrome;
        
    }
}
