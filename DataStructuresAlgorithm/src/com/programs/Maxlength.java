package com.programs;
import java.util.LinkedHashSet;
import java.util.Set;

public class Maxlength {
    public static int lengthOfLongestSubstring(String s) {
        int lengthofSubstring =0;
        int j =0;
        Set<String> strList = new LinkedHashSet<>();
        String[] strArr = s.split("");
        if(!s.equals("")) {
        String tempStr = strArr[0];
        for (int i=1;i<strArr.length;i++){
            if(tempStr.contains(strArr[i])){
                strList.add(tempStr);
                j++;
                i=j;
                tempStr = strArr[j];
            }
            else{
                tempStr+=strArr[i];
                System.out.println(tempStr);
                
            }
        }
         strList.add(tempStr);
    }
    else if(s.equals("")) {
        System.out.println("Inside");
        lengthofSubstring =0;
    }
       
        
        System.out.println(strList.size());
        for (String string1 : strList) {
            System.out.println(string1);
            if(string1.length()>lengthofSubstring){
                lengthofSubstring = string1.length();
                System.out.println(lengthofSubstring);
        
            }
        
    }
    return lengthofSubstring;
}
    public static void main(String[] args) {
        String s1 = "dvdf";
        int lengthofStr = lengthOfLongestSubstring(s1);
        System.out.println(lengthofStr);
    }
}
