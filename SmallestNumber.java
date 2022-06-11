package com.company;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        int n,rem,smallest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        smallest = n%10;
        while(n>0)
        {
            rem = n%10;
            if(smallest>rem){
                smallest = rem;
            }
            n=n/10;
        }
        System.out.println("The smallest number is the : "+smallest);
    }
}
