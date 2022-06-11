package com.company;

import java.util.Scanner;

public class Peterson_practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int price[]=new int[n];
        int distance[]=new int[n];
        int sku[]=new int[n];

        for(int i=0;i<n;i++)
            price[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            distance[i]=sc.nextInt();

        for(int i=0;i<n;i++)
            sku[i]=sc.nextInt();

        int finalPrice[]=new int[n];
        int count =0;

        for(int i=0;i<n;i++)
        {
            if(sku[i]>0)
            {
                finalPrice[count]= price[i] * distance[i];
                count++;
            }
        }

        for(int i=0;i<count;i++)
        {
            System.out.print(finalPrice[i]+" ");
        }
    }
}