package com.programs;
public class PalindromeFind {
    public static boolean isPalindrome(int x) {
        boolean bool = true;
        int left = 0;
        int right = String.valueOf(x).length()-1;
        while(left<right){
            if(String.valueOf(x).charAt(left) != String.valueOf(x).charAt(right)){
                bool = false;
            }
            left++;
            right--;
        }
        return bool;
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
