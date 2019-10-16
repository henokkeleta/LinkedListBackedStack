package com.edagana;

import java.util.LinkedList;

public class Main {
    private LinkedList<String> stack;
    public static void main(String[] args) {

        
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {

       // string=string.replaceAll("\\p{Punct}", "");
         string=string.replaceAll("\\W", "");//This will replace all the punctuations and space with ""
         string=string.toLowerCase();
        System.out.println("the string is "+string);

        LinkedList stack = new LinkedList();
        String temp="";
        for(int i=0;i<string.length();i++)
        {
        stack.push(string.charAt(i));//pushes each character in the string to the stack
        }
        for(int j=0;j<string.length();j++) {

           temp=temp+stack.pop();
            System.out.println("hi i am from temp :"+temp);
        }
        if(temp.equals(string)) {//compares to check the poped  and collected characters to the original string
            return true;
        }

        return false;
    }
}

