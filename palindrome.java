package com.company;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        String str,rev ="";
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        for(i= str.length()-1;i>=0;i--);
        rev= rev + str.charAt(i);
        if(str==rev)
        {
            System.out.println("The given string is palindrome.");
        }
        else
        {
            System.out.println("The given string is not palindrome.");
        }
    }
}