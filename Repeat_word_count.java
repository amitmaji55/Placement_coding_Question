package com.company;

import java.util.Scanner;

public class Repeat_word_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int l = str.length();
        int count =0;
        for (int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a')
                count++;
        }
        System.out.println(count);
    }
}
