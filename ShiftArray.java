package com.company;

import java.util.*;
class ShiftArray
{
    void Shift(int x[],int n,int y)
    {
        int i;
        x[0]=x[y];
        for(i=y;i<n;i++)
        {
            x[i]=x[i+1];
        }
        n--;        
        for(i=n;i>=1;i--)
        {
            x[i+1]=x[i];
        }
        x[1]=x[0];
        for(i=1;i<=n+1;i++)
        System.out.print(x[i]+" ");
    }
    public static void main(String args[])
    {
        int n,i,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        n=sc.nextInt();
        int x[]=new int[n+1];
        for(i=1;i<=n;i++)
        {
            System.out.print("Enter the value of "+i+" : ");
            x[i]=sc.nextInt();
        }
        System.out.print("Enter the no. of shift :");
        y=sc.nextInt();
        ShiftArray ob = new ShiftArray();
        ob.Shift(x,n,y+1);
    }
}
        
            
        
        