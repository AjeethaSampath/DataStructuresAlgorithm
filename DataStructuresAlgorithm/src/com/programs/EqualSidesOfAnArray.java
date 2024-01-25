package com.programs;
import java.util.Arrays;
import java.util.Scanner;

public class EqualSidesOfAnArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int leftArray = 0;
        int rightArray = 0;
        String inputString = scan.nextLine();
        String[] firstSplit = inputString.split(",");
        String newString = Arrays.toString(firstSplit);
        for (int index = 0; index < firstSplit.length; index++) {
            leftArray = 0;
            rightArray = 0;
            for(int innerIndex =0; innerIndex<firstSplit.length;innerIndex++){
                if(index == 0){
                    leftArray = 0;
            }
            if(index == innerIndex){
                continue;
            }
            else if(innerIndex>index){
                rightArray+=Integer.parseInt(firstSplit[innerIndex]);
            }
            else if(innerIndex<index){
                leftArray+=Integer.parseInt(firstSplit[innerIndex]);
            }
            
        }
        if(leftArray == rightArray){
            System.out.println("Index : "+ index);
        }
        

    }
}
}