package com.company;

import java.util.Locale;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        String x;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your string:");
        x = sc.nextLine();
       x = x.replaceAll("","").toLowerCase(Locale.ROOT);
       String s ="";
       for(char i ='a';i<='z';i++)
       {
           if(x.indexOf(i)!=-1)
           {
               s=s+i;
           }
       }
    if(s.length()==26){
        System.out.println("Pangram");
    }
    else{
        System.out.println("Not pangram");
    }
    }
}