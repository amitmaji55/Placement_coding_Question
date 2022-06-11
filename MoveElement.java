package com.company;

import java.util.Scanner;

public class MoveElement {
    public static void moveZero(int[] arr)
    {
        int count =0;
        int size =arr.length;
        for (int i =0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        while(count<size)
        {
            arr[count++]=0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i =0;i< arr.length;i++)
        {
            System.out.println("enter the "+ i + "element :");
            arr[i]=sc.nextInt();
        }
        moveZero(arr);
        System.out.println("Array After Moving Zeroes : ");
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }

    }
}
