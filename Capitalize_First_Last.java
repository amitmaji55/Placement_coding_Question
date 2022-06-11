package com.company;
import java.util.Scanner;

public class Capitalize_First_Last {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        str = str + '\0' ;
        char[] str1 = str.toCharArray();
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(i==0 || str1[i-1]==' ')
            {
                str1[i] = Character.toUpperCase(str1[i]);
            }
            else if (str1[i]==' '||str1[i]=='\0')
            {
                str1[i-1] = Character.toUpperCase(str1[i-1]);            }
        }
        for(int i=0;i<str.length();i++)
         System.out.println(str1[i]);
    }
}
