package com.company;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Remove_consosnat_duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        String word = "";
        int l = str.length();
        for (int i=0;i<l;i++)
        {
            char ch = str.charAt(i);
            if(ch=='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u')
            {
                word = word + ch;
            }
        }
         LinkedHashSet<Character> ob = new LinkedHashSet<>();
        for (int i=0;i<word.length();i++)
        {
            ob.add(word.charAt(i));
        }
        for(Character ch : ob)
        {
            System.out.print(ch);
        }

    }
}
