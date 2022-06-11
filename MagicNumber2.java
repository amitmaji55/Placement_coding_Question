package com.company;

import java.util.Scanner;

public class MagicNumber2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        while(n>0 || sum>9)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum = sum+(n%10);
            n = n/10;
        }
            if(sum==1)
                System.out.println("magic number");
            else
                System.out.println("not a magic number");
    }

}
