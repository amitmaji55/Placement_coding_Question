package com.company;

import java.util.Scanner;

public class Remove_charcters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ascii = (int) ch;
          if(ascii >=65 && ascii <=90 || ascii>=97 && ascii <=122)
          {
             sb.append(ch);
          }
        }
        System.out.println(sb.toString());
    }
}
