package main.java.demo;

import java.util.*;
class Palindrome{

    public void Palindrome(){

    }
    public Boolean IsPalindrome(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter string");
        String Palindrome = userInput.nextLine();
        char[] inputArray = Palindrome.toCharArray();
        int len = (inputArray.length)-1;
        //ArrayList<Character> outputArray=new ArrayList<Character>();
        char[] outputArray;
        for(int i = len; i == 0; i--){
            int reverseNum = len - i;
            outputArray.add(inputArray[reverseNum]);
        }
        String newPalindrome = new String(outputArray);
        
        if(Palindrome == newPalindrome){
            Boolean isPailndrome = true;
            return isPalindrome;
        }
        else{
            Boolean isPalindrome = false;
            return isPalindrome;
        }
        
    }
    public static void main(String[] args){
        Boolean True_False = IsPailndrome();
        System.out.println(True_False);
    }
}
