package com.company;

import java.util.Scanner;

public class Segraagate0_1 {
    public static int[] separate(int[] arr,int len)
    {
        int left = 0;
        int right = len-1;
        while(left<right)
        {
            while( arr[left] ==0 && left<right)
                left++;
            while (arr[right]==1 && left<right)
                right--;
            if(left<right)
            {
                arr[left++]=0;
                arr[right--]=1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array : ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
       arr = separate(arr,len);
        for (int i=0;i<len;i++)
        {
            System.out.print(arr[i]);
        }
    }

}
