package com.company;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        int l = str.length();
        for (int i =l-1; i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                char ch = str.charAt(j);
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
