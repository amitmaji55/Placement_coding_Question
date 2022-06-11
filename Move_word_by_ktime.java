package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Move_word_by_ktime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a string :");
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        int n = sc.nextInt();
       char ch1;
        char ch;
      char ch2;
        int x,y;
       String str1="";
       for (int i=0;i<str.length();i++)
       {
           ch = str.charAt(i);
            x = (int) ch;
           if(x+n>90)
           {
               y = (x+n)-90;
               ch2 = (char) ((char) 64+y);
           }
           else
           {
               ch2 = (char) ((int)ch+n);

           }
           str1 =str1 + ch2;
       }
        System.out.println(str1);
    }
}
