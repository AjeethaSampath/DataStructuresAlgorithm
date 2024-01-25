package com.programs;
import java.time.LocalTime;
import java.util.Scanner;

public class TimeInHours {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    System.out.println(LocalTime.MIN.plusSeconds(input).toString());
    scan.close();
}
    
}