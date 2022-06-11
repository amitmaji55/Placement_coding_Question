package com.company;

import java.util.Scanner;

public class NameAllocaion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String str = sc.nextLine();
        int len = str.length();
        String str1 = "";
        for (int i=0;i<len;i++)
        {
            char ch = str.charAt(i);
            if(ch != ' '){
                str1 = str1+ch;
            }
            else {
                System.out.print(str1.charAt(0) + ".");
                str1 = "";
            }
        }
        String str2 = "";
        for (int j=0;j<str1.length();j++) {
            if (j == 0)
                str2 = str2 + str1.charAt(0);
            else
                str2 = str2 + str1.charAt(j);
        }
        System.out.print(str2);
    }
}
