package com.programs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SubstringFind {
    public static int lengthOfLongestSubstring(String s) {
        int lengthofSubstring =0;
        int startPosition =0;
        Set<String> strList = new LinkedHashSet<>();
        String[] strArr = s.split("");
        if(!s.equals("") && !s.equals(" ")) {
            System.out.println("Inside1");
            if(s.length()==1){
                lengthofSubstring++;
            }
            else {
        for(int i =0;i<strArr.length;i++){
            for(int j=i+1;j<strArr.length;j++){
                if(!strArr[i].equals(strArr[j])){
                    if(j==s.length()-1 && strList.size() == 0){
                        System.out.println("Inside2");
                        lengthofSubstring = s.length();
                        break;
                    }
                    continue;
                }
                else{
                    System.out.println("inside else");
                     strList.add(s.substring(startPosition,j));

                     startPosition = j;
                     lengthofSubstring = 0;
                     System.out.println(strList.size());
                     strList.forEach(System.out::println);
                     if(j == s.length()-1){
                        System.out.println(strList.size());
                        for (String string1 : strList) {
                            System.out.println(string1);
                            if(string1.length()>lengthofSubstring){
                                lengthofSubstring = string1.length();
                                System.out.println(lengthofSubstring);
                        
                            }
                            System.out.println(lengthofSubstring);
                        }
                        return lengthofSubstring;
                    }
                    else{
                        continue;
                    }
                     
                }
                
            }
        }
    }
    }
    else if(s!=null && s.length() == 1) {
        lengthofSubstring = s.length();
    }
        else if(s.equals("")) {
            System.out.println("Inside");
            lengthofSubstring =0;
        }

        return lengthofSubstring;
    }
    
    public static void main(String[] args) {
        String s1 = "dvdf";
        int lengthofStr = lengthOfLongestSubstring(s1);
        System.out.println(lengthofStr);
    }
}
