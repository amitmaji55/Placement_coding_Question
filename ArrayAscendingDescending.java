package com.company;

import java.util.Scanner;

public class ArrayAscendingDescending {
    public static void main(String[] args) {
        int temp;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        System.out.println("enter the length of the array : ");
        int len = sc.nextInt();
        System.out.println("enter the elements of the array : ");
        for(int i =0;i<len;i++)
        {
            arr[i] =sc.nextInt();
        }
        for (int i =0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println ("Sorted array ");
        for (int i = 0; i < len / 2; i++)
        {
            System.out.println (arr[i]);
        }
        for (int i = len - 1; i >= len / 2; i--)
        {
            System.out.println ( arr[i]);
        }
    }
}
