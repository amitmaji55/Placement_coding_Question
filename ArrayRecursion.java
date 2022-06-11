package com.company;

public class ArrayRecursion {
    public static void ReverseArray(int[] arr,int i)
    {
       if(i==arr.length)
           return;
       ReverseArray(arr,i+1);
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        ReverseArray(arr,0);

    }
}
