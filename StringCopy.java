package com.company;
import java.util.Scanner;
public class StringCopy {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String y;
        String rev = "";
        System.out.println("Enter the string : ");
        y = sc.nextLine();
        int l = y.length();
        for(int i=l-1;i>=0;i--)
        {
            rev = rev+y.charAt(i);
        }
        if(y.equals(rev))
        {
            System.out.println(" Palindrome ");
        }
        else
        {
            System.out.println(" Not Palindrome ");
        }
    }
}
