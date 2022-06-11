package com.company;

import java.util.*;
public class mainqs
{
    public static int endWithmOrn(String stng)
    {
        int l = stng.length();
        int ctr = 0;
        stng = stng.toLowerCase();
        for (int i = 0; i < l; i++)
        {
          //FOR NUMBERS -----
            if (stng.charAt(i) >=48 && stng.charAt(i) <=57 )
            //FOR APLPAHBETS
            //if(stng.charAt(i)=='a')
            {
                if (i >= l - 1 || Character.isLetter(stng.charAt(i + 1))) {
                    if (i == l-1)
                        ctr++;
                } else {
                    ctr++;
                }
            }
        }
        return ctr;
    }

    public static void main (String[] args)
    {
        mainqs ob = new mainqs();
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        str=sc.nextLine();
        System.out.println("The given string is: "+str);
        System.out.println("The number of words ends with number is: "+mainqs.endWithmOrn(str));
    }
}
