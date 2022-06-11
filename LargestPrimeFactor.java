package com.company;

import java.util.Scanner;

public class LargestPrimeFactor {
    public static int LargestPrime(int n)
    {
        if(n<=1)
        {
            return 0;
        }
        else
        {
            int div = 2;
            while(div <n)
            {
                if(n%div!=0)
                {
                    div++;
                }
                else
                {
                    n = n/div;
                    div =2;
                }
            }
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int result = LargestPrime(n);
        System.out.println("The largest prime factor is : "+result);
    }
}
