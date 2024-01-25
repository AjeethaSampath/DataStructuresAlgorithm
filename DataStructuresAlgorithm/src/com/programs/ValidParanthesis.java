package com.programs;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidParanthesis {

    public static void main (String[] args){
        Scanner scanInput = new Scanner(System.in);
        String strParanthesis = scanInput.nextLine();
        int leftParanthesisCount =0;
        int rightParanthesisCount =0;
        //Pattern pat = Pattern.compile(strParanthesis);
        //Matcher matchingPat = pat.matcher("[a-z0-9]{4,16}");
        //Boolean validValue = Pattern.matches("[a-z0-9_]{4,16}", strParanthesis);
        //if(validValue){
               // System.out.println("Valid Name");
        //}
        //else{
            //System.out.println("Invalid Name");
       // }
        String[] strArray = strParanthesis.split("");
        if(strArray[0].equals(")")){
            System.out.println("Invalid");
        }
        else if(strArray[strArray.length - 1].equals("(")){
            System.out.println("Invalid");
        }
        else {
            for (String stringNew : strArray) {
                if(stringNew.equals("(")){
                    leftParanthesisCount++;
                }
                else if(stringNew.equals(")")){
                    rightParanthesisCount++;
                }
            }
            if(leftParanthesisCount == rightParanthesisCount){
                System.out.println("Valid");
            }
            else {
                System.out.println("Invalid");
            }
        }
        //LocalTime.MIN.plusSeconds()
        scanInput.close();
    }
}