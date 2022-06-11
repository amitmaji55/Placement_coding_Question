package com.company;

import java.util.*;
public class MoveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String str = sc.nextLine();
        System.out.print("Enter the no. of movement : ");
        int n=sc.nextInt();
        String str1="";
        int l = str.length();
        char ch2;
        int x,y;
        str=str.toUpperCase();
        for (int i = 0; i < l; i++) {
            char ch = str.charAt(i);
            x=(int)ch;
            if(x+n>90) {
                y = (x + n)-90;
                ch2=(char)(64+y);
            }
            else
                ch2 = (char) ((int) ch + n);
            str1 += ch2;
        }
        System.out.print(str1);
    }
}