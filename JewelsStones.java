package com.company;

import java.util.Scanner;

public class JewelsStones {
    static int numJewelStone(String jewel , String stone)
    {
        int count=0;
        char[] ch1 = jewel.toCharArray();
        char[] ch2 = stone.toCharArray();
        int m = jewel.length();
        int n = stone.length();
        for(int i=0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                if(ch1[i] == ch2[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the jewels : ");
        String jewel = sc.nextLine();
        System.out.println("Enter the stone : ");
        String stone = sc.nextLine();
        System.out.println(numJewelStone(jewel,stone));
    }
}
