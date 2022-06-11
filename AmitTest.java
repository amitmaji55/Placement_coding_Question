package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AmitTest
    {
        public static void main(String[] args) {
            Scanner cs=new Scanner(System.in);
            String str1;
            System.out.println("Enter your String:");
            str1=cs.nextLine();
            str1+=' ';
            char[] str=str1.toCharArray();
            for(int i=0;i<str1.length();i++)
            {
                if(i==0 || str[i-1]==' ')
                {
                    str[i]=Character.toUpperCase(str[i]);
                }
                else if(str[i]==' ')
                    str[i-1]=Character.toUpperCase(str[i-1]);
            }
            System.out.print("After Converting String is: ");
            for(int i=0;i<str1.length();i++)
                System.out.print(str[i]);
            cs.close();
        }
    }