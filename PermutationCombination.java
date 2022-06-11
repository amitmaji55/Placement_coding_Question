package com.company;

import java.util.Scanner;

public class PermutationCombination {
    static final int max = 26;
    static int factorial(int n)
    {
        int fact=1;
        for(int i =2;i<=n;i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    static int CountString(String str)
    {
        int len = str.length();
        int[] arr = new int[max];
        int fact =1;
        for (int i=0;i<max;i++)
        {
            fact = fact * factorial(arr[i]);
        }
        return  factorial(len)/fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        System.out.println(CountString(str));
    }
}
