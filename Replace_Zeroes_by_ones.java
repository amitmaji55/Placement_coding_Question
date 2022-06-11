package com.company;

import java.util.Scanner;

public class Replace_Zeroes_by_ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int ans = 0;
        int temp = 1;
        if(n==0)
            System.out.println("1");
        while(n!=0)
        {
            int rem = n%10;
           if(rem==0)
           {
               rem = 1;
           }
          ans = temp * rem + ans;
           n = n/10;
           temp = temp * 10;

        }
        System.out.println(ans);
    }
}
