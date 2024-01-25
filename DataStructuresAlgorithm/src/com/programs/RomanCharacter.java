package com.programs;
import java.util.HashMap;
import java.util.Map;

public class RomanCharacter {
     public static int romanToInt(String s) {
      Map<Character,Integer> signMap = new HashMap<>();
      int finalOutput = 0;
    signMap.put('I',1);
    signMap.put('V',5);
    signMap.put('X',10);
    signMap.put('L',50);
    signMap.put('C',100);
    signMap.put('D',500);
    signMap.put('M',1000);

    for(int i=0;i<s.length();i++){
        if(i<s.length()-1 && signMap.get(s.charAt(i))<signMap.get(s.charAt(i+1))){
                finalOutput-=signMap.get(s.charAt(i));
        }
        else{
            finalOutput+=signMap.get(s.charAt(i));
        }
    }
    //if(s.charAt(0))

        return finalOutput;
    }
    
    public static void main(String[] args) {
        System.out.println(romanToInt("MIXXIV"));
    }
}
