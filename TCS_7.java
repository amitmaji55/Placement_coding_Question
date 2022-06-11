package com.company;

import java.util.Scanner;

public class TCS_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the interior walls : ");
        int interior = sc.nextInt();
        System.out.println("Enter the exterior walls : ");
        int exterior  = sc.nextInt();
        float p=18,q=12,cost=0;
        float temp;
        if(interior<0 || exterior<0)
        {
            System.out.println("Invalid Input");
        }
        else if ( interior==0 || exterior==0)
        {
            System.out.println("Total estimated cost : 0.0");
        }
        else
        {
            for(int i=0;i<interior;i++)
            {
                temp = sc.nextFloat();
                cost   += interior*cost+temp;
            }
            for (int i=0;i<exterior;i++)
            {
                temp = sc.nextFloat();
                cost += exterior*cost+temp;
            }
            System.out.println("Total estimated cost : "+cost);
        }

    }
}
