package com.company;
import java.util.Scanner;
public class RecurFibo {
    public static int calfactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        int f = calfactorial(n-1);
        int n1 = n*f;
        return  n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}
