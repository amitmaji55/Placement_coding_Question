package com.company;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String str1;
        int i=0,n=0,c=0;
        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        String[] arr = new String[count];
        while(st.hasMoreTokens())
        {
            str1 = st.nextToken();
            arr[n++] = str1;
        }
    for (i=0;i<count;i++)
    {
        String word = arr[i];
        char ch = word.charAt(0);
        if(!Character.isLetterOrDigit(ch) &&  !Character.isAlphabetic(ch))
            c++;
    }
        System.out.println(c);
    }
}
