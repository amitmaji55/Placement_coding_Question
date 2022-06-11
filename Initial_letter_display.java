package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Initial_letter_display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        String word = ""+str.charAt(0);
        int l = str.length();
        for (int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                word = word+str.charAt(i+1);
            }
        }
        System.out.println(word);
    }


}
