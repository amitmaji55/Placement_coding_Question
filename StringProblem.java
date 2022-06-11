package com.company;

import java.util.Scanner;

public class StringProblem {
    public static String getString(String str)
    {
        String word ="";
        String word1 ="";
        int l = str.length();
        for (int i=0;i<l;i++)
        {
            if(i==0 && str.charAt(0)=='j')
            {
                word +='j';
            }
            else if(i==1 && str.charAt(1)=='b')
            {
                word +='b';
            }
            else {
                if(i>1)
                    word += str.charAt(i);

            }

        }
        return word;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        System.out.println(getString(str));
    }
}
