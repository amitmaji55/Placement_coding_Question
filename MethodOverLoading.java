package com.company;

import java.util.Scanner;

class MethodOverLoading {
    int area(int l , int b)
    {
        int arr;
        arr =l*b;
        return  arr;
    }
    double area(double r)
    {
       double arr;
       arr = 3.14*r*r;
       return arr;
    }
   int area(int s)
    {
       int arr1;
        arr1 = s*s;
        return  arr1;
    }

    public static void main(String[] args) {
        int l,b;
        double s,r;
        Scanner sc = new Scanner(System.in);
        MethodOverLoading ob = new MethodOverLoading();
        System.out.println("Enter the length : ");
        l = sc.nextInt();
        System.out.println("Enter the breadth : ");
        b = sc.nextInt();
        int res1 = ob.area(l,b);
        System.out.println("Enter the side : ");
        s = sc.nextInt();
       double res2 = ob.area(s);
        System.out.println("Enter the radius : ");
        r = sc.nextInt();
        double res3 = ob.area(r);
        System.out.println(+res1 +" "+res2+ " "+res3);
    }

}
