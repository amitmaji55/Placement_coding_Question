package com.company;

import java.util.*;
class SetAllocation {
 static int sumDigit(int n)
    {
        int sum=0,rem;
        while(n!=0)
        {
            rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        if(sum>=1 && sum <= 26)
             return sum;
        else
            return sumDigit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int s = sumDigit(n);
        int c = (64+s);
        char ch = (char) c;
        System.out.println("the corresponding alphabet for the set is : "+ch);
    }
}

        