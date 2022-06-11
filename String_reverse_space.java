package com.company;

import java.util.Scanner;

public class String_reverse_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, str1="",str2 = " ";
        System.out.println("Enter a string : ");
        str = sc.nextLine();
       str = str+str2;
        int l = str.length();
        for (int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch == ' ')
            {
                for (int j=0;j<str1.length();j++)
                {
                    char ch1 = str1.charAt(j);
                    str2 = ch1+str2;
                }
                System.out.print(str2+" ");
            str1 = "";
            str2 = " ";
            }
            else
                str1 = str1+ch;
        }
    }
}
