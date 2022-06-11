package com.company;
import java.util.Locale;
import java.util.Scanner;
public class PrintFirstWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :  ");
        String str = sc.nextLine();
        str = str.toUpperCase(Locale.ROOT);
        str = str.trim();
        str = " "+str;

        for (int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                System.out.println("the fisrt letter of the word is : "+ str.charAt(i+1));
            }
        }

    }
}
