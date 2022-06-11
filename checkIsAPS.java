package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class checkIsAPS {
  public  static boolean checkIsAP(int arr[], int n)
    {
        if (n == 1)
            return false;
        Arrays.sort(arr);
       int d = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
        {
            if (arr[i] - arr[i - 1] != d)
            {
                 return false;
            }
        }
        return true;
    }
  public static boolean checkIsGP(int arr[], int n)
    {
        if (n == 1) {
            return false;
        }
        int r = arr[1] / arr[0];
        for (int i = 2; i < n; i++) {
            if (arr[i] / arr[i - 1] != r)
                return false;
        }
            return true;
    }
    public static boolean checkIsFibonacci(int arr[], int n)
    {
        if (n == 1 || n == 2)
            return true;
        Arrays.sort(arr);
        for(int i = 2; i < n; i++)
        {
            if ((arr[i - 1] + arr[i - 2]) != arr[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

       int f=  arr[0];
       int l = arr[1];
       int d = l-f;
        int r = arr[1] / arr[0];
        int ss = arr[n-1];
       if(checkIsAP(arr,n))
       {
          int  s = ( arr[1] + (n-1) * d);
           System.out.println("It's Ap Series"+" "+s);
       }
       else if(checkIsGP(arr,n))
       {
         r =  ( arr[1] * (int)(Math.pow(r, n - 1)) );
           System.out.println("It's Gp Sries"+" "+r);
       }
        else if (checkIsFibonacci(arr,n))
        {
            double a = ss * (1 + Math.sqrt(5)) / 2.0;
       }
    }
}
