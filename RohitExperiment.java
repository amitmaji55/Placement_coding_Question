package com.company;

import java.util.Scanner;

public class RohitExperiment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1="",str2="";
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                str1 +=ch;
            }
            else
            {
                str2 +=ch;
                if(str1.equals(str2))
                {
                    count++;
                    str1="";
                    str2="";
                }
            }
        }
        System.out.println(count);
    }
}
