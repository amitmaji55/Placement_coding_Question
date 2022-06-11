package com.company;

import java.util.Scanner;

public class Automorphic {
    public static  boolean isAuto(int n)
    {
        int sq = n*n;
        while(n!=0)
        {
            if(n%10!=sq%10)
                return false;
             n = n/10;
             sq = sq/10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n= sc.nextInt();
        if(isAuto(n))
        System.out.println("automorphic");
        else
            System.out.println("Not automorphic");
    }
}
