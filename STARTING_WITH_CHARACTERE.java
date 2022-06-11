package com.company;

import java.util.Scanner;

public class STARTING_WITH_CHARACTERE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        int c=0;
        for (int i=0;i<str.length();i++)
        {
            for (int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==' ' && str.charAt(j)>=33 && str.charAt(j)<=47)
                {
                    if (str.charAt(0)>=33 && str.charAt(j)<=47)
                        c++;
                }
            }
        }
        System.out.println(c);
    }
}
