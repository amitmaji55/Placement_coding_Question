package com.company;

import java.util.Scanner;

public class POSITION_OF_VOWEL {

    public static void main(String args[]) {

        String str;
        int n;
        Scanner sc=new Scanner(System.in);
        n=0;
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        str=str.toUpperCase();
        int i;
        char pos1,pos2;
        System.out.print("Pair of vowels:");
        for(i=0;i<str.length()-1;i++)
        {
            pos1=str.charAt(i);
            pos2=str.charAt(i+1);
            if(pos1=='A'||pos1=='E'||pos1=='I'||pos1=='O'||pos1=='U')
            {
                if(pos2=='A'||pos2=='E'||pos2=='I'||pos2=='O'||pos2=='U')
                {
                    System.out.println(pos1+""+pos2+",");
                    n=n+1;
                }
            }
        }
        System.out.println();
        System.out.println("No. of pair of vowels="+n);
    }
}