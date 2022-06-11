package com.company;

import java.util.Scanner;

public class IsbnNumber {
    public static  boolean isIsbn(int n)
    {
        int temp,temp1,sum=0,rem,count=0;
        temp = n;
        temp1 = n;
        while(temp!=0)
        {
            temp =temp /10;
            count++;
        }
        if(count!=10)
            System.out.println("Its not An Valid ISBN");
        while(temp1>0)
        {
            rem = temp1%10;
            sum = sum + (rem*count);
            temp1 = temp1/10;
            count--;
        }
        if(sum%11==0)
            return  true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ISBN number : ");
        int n = sc.nextInt();
        if(isIsbn(n))
            System.out.println("Valid ISBN Number");
        else
            System.out.println("Not a valid ISBN number");
    }
}
