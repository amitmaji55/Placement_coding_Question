package com.company;

import java.util.Scanner;

public class PetersonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = num;
        int fact=1,sum=0;
        while(num!=0)
        {
            fact =1;
            int r = num%10;
            for(int i=1;i<=r;i++)
            {
               fact = fact*i;
            }
            sum = sum+fact;
            num = num/10;
        }
        if(sum==temp)
        {
            System.out.println("Peterson number");
        }
        else
        {
            System.out.println("Not a peterson number");
        }
    }
}
