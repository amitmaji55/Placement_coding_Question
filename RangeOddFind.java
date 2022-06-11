package com.company;

import java.util.Scanner;

public class RangeOddFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the m'th range :");
        int m = sc.nextInt();
        System.out.println("Enter the n'th range : ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%2!=0)
            {
                sum = sum+i;
            }
        }
        System.out.println("The sum is : "+sum);
    }
}
