package com.company;
import java.util.Scanner;
public class FrequncyLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
         int i;
      int[] x = new int[500];
        for(i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            x[ch]++;
            
        }
        for(i=0;i<500;i++)
        {
            if(x[i]!=0)
            {
                System.out.println((char)i+"-"+x[i]);
            }
        }
    }
}
