package com.company;

import java.util.Scanner;

public class MaxminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter the elements:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i< arr.length; i++)
        {
            if (max < arr[i]) {
                max = arr[i];
            }
          else if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The max value is: "+max+ " the min value is : "+min);

    }
}