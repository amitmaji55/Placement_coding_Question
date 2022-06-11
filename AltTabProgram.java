package com.company;
import java.util.Scanner;
public class AltTabProgram {
  public void  CountShift(int n, int[] a, int k)
    {
        int index =0;
        int position = k%n;
        int temp = position;
        int tab = a[index];
        while(temp>0)
        {
            int temp1 = temp;
            temp--;
            a[temp1]= a[temp];
        }
        a[0] = tab;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {3,5,4,2,1};
        int n = a.length;
        int k=3;

            AltTabProgram ob = new AltTabProgram();
            ob.CountShift(n,a,k);


    }
}
