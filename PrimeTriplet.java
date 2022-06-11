package com.company;
import java.util.Scanner;
class PrimeTriplet
{
    static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1; i<=n; i++)
        {
            if(n%i == 0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range M  : ");
        int m = in.nextInt();
        System.out.println("Enter the range  N : ");
        int n = in.nextInt();

        for(int i=m; i<=n-6; i++)
        {
            if(isPrime(i)&&isPrime(i+2)&&isPrime(i+6))
                System.out.println(i + " " + (i+2) + " " + (i+6));
        }
    }
}