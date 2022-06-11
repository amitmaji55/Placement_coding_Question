package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PushZeroesToEnd {
    static void move_zero(int[] arr)
    {
        int count=0;
        int length = arr.length;
        for(int i=0;i<length;i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
            if(count < length)
            {
                arr[count++]=0;
            }
    }

    public static void main(String[] args) throws  java.lang.Exception
    {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        String[] str = ob.readLine().split(",");
        int[] arr  = new int[str.length];
        for(int i=0;i< str.length;i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        move_zero(arr);
        System.out.println("Array after moving zeroes: ");
        for(int i=0;i<str.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
