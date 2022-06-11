package com.company;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String str = sc.nextLine();
        int l = str.length();
           for (int i=0;i<l+1;i++)
           {
               System.out.println(str.substring(0,i));
           }
        }
    }
