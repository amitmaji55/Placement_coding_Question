package com.company;
import java.util.Scanner;
public class Remove_parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='(' && str.charAt(i)!=')')
            {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
