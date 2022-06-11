package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Cipher_text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter move value : ");
        int val = sc.nextInt();
        String word = "";
        char ch2;
        int x,y;
        str = str.toUpperCase(Locale.ROOT);
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            x = (int) ch;
            if(x+val>90)
            {
               y = (x+val) - 90;
               ch2 = (char) (64+y);
            }
            else
            {
                ch2 = (char) (x+val);
            }
            word = word + ch2;
        }
        System.out.println(word);
    }
}
