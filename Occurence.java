package com.company;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Sentence : ");
        String str = sc.nextLine();
        System.out.println("Enter the word to be searched : ");
        String word = sc.nextLine();
        str = str.toLowerCase();
        String[] a = str.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if (word.equals(a[i]))
                count++;
        }
        System.out.println("No of ocuurence is : "+count);
    }
}