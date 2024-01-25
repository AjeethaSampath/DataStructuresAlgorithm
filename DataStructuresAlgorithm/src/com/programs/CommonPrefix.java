package com.programs;
import java.util.Arrays;

public class CommonPrefix {
    
    public static String longestCommonPrefix(String[] strs) {
        String resultStr = null;
        StringBuilder strBuild = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(), last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                return strBuild.toString();
            }
            strBuild.append(first.charAt(i));
        }
        System.out.println(Arrays.toString(strs));
        return strBuild.toString();
    }

    public static void main(String[] args) {    
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
}
