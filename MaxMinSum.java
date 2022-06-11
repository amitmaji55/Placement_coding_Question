package com.company;

import java.util.Scanner;

public class MaxMinSum {
    public static int Sum(int n, int[] m)
        {
            int sum =0 ;
            int max = m[0];
            int min = m[0];
            for(int i=0;i<n;i++)
            {
                if(m[i]>max)
                    max = m[i];
                if(m[i]<min)
                    min = m [i];
            }
            sum = max+min;
            return  sum;
        }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] m = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i=0;i<n;i++)
        {
            m[i] = sc.nextInt();
        }

        System.out.println("Sum is : " +Sum(n,m));

    }
}
