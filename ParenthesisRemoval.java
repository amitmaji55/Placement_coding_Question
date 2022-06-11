package com.company;

import java.util.Scanner;
public class ParenthesisRemoval {
    static int CountOccurence(int m,int n ,int d)
        {
           int c=0;
           for(int i=m;i<=n;i++)
           {
               int temp=i;
               while(temp>0)
               {
                   if(temp%10==d)
                       c=c+1;
                   temp=temp/10;
               }
           }
           return c;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the digit you want to search : ");
        int d = sc.nextInt();
        System.out.println("Enter the value of 1st range : ");
        int m = sc.nextInt();
        System.out.println("Enter the value of last range : ");
        int n = sc.nextInt();
       int res=  CountOccurence(m,n,d);
        System.out.println("The no of occurences is :  "+res);
    }
}


