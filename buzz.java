package com.company;

import java.util.Scanner;

public class buzz {
    static boolean isbuzz(int n)
    {
        if(n%7==0 || n%10==7)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n1 = sc.nextInt();
        if (isbuzz(n1))
        {
            System.out.println("buzz number");
        }
        else
        {
            System.out.println("not buzz number");
        }
    }
}