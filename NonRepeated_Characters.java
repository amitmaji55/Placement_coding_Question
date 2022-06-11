package com.company;

import java.util.Scanner;

public class NonRepeated_Characters
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        int [] arr = new int[256];
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                arr[str.charAt(i)]++;
            }
        }
        char ch = ' ';
        for (int i=0;i<str.length();i++){
            if(arr[str.charAt(i)]==1)
            {
                ch = str.charAt(i);
                System.out.println(ch);
            }
        }


    }
}
