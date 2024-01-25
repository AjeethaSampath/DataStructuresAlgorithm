package com.programs;
public class LastWord {
    public static int lengthOfLastWord(String s) {
        String[] newStr = s.split(" ");
        String lastString = newStr[newStr.length-1];
        int maxLength = lastString.length();
        return maxLength;
    }
    public static void main(String[] args) {
       System.out.println( lengthOfLastWord("Hello World"));
    }
}
