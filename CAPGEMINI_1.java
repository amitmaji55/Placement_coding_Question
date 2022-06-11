package com.company;

import java.util.Scanner;

public class CAPGEMINI_1 {
    public static int rat_house_problem(int[] arr,int n,int r,int unit)
    {
        if(arr==null)
            return -1;
    int req = r*unit;
    int count = 0;
    int sum =0;
    for(int i =0;i<n;i++)
    {
        sum = sum+arr[i];
        count++;
        if(sum>=req)
            break;
    }
    if(sum<req)
        return  0;
    return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of rats : ");
        int r = sc.nextInt();

        System.out.println("Enter the value of food unit : ");
         int unit = sc.nextInt();

        System.out.println("output is : " +rat_house_problem(arr,n,r,unit));

    }
}
