package com.company;

import java.util.Scanner;

public class TCS_6 {
    static  void WashingMachine(int n)
    {
        if(n==0)
            System.out.println("Estimated time : 0 min");
        if(n>0 && n<=2000)
            System.out.println("Estimated time : 25 min");
       else if(n>2000 && n<=4001)
            System.out.println("Estimated time :35 min");
       else if(n>4001 && n<=7000)
            System.out.println("Estimated time :45 min");
       else
            System.out.println("Invalid Input");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of weight : ");
        int n = sc.nextInt();
        WashingMachine(n);
    }
}
