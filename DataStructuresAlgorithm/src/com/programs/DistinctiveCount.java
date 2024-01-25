package com.programs;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctiveCount {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputStr = scan.nextLine();
        int flag =0;
        int finalCount =0;
        String newInputStr = inputStr.toLowerCase();
        String[] strArr = newInputStr.split("");
        //System.out.println(Arrays.toString(strArr));
        Set<String> firstSet = new HashSet<>();
        for (int i=0;i<strArr.length;i++){
            firstSet.add(strArr[i]);
        }
        //System.out.println(firstSet);
        for (String stringInSet : firstSet) {
            //System.out.println(Arrays.toString(strArr));
            for (String stringArr : strArr) {
                //System.out.println("Inside for: "+ stringArr);
                if(stringInSet.equals(stringArr)){
                    //System.out.println("StringInSet : " + stringInSet);
                    //System.out.println("String in Array:"+ stringArr);
                    flag++;
                }
                //System.out.println(flag);
            }
            if(flag>1){
                //System.out.println("Flag : "+stringInSet);
                finalCount++;
            }
            flag=0;
        }
        System.out.println(finalCount);
        scan.close();
    }
}