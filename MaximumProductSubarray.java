package com.company;

import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {6, -3, -10, 0, 2};
        int result = Integer.MIN_VALUE;
        for (int i=0;i<arr.length-1;i++)

            for (int j=i+1;j<arr.length;j++)
            {
                int product = 1;
                for (int k=i;k<=j;k++) {
                    product = product * arr[k];
                    result = Math.max(product, result);
                }
        }
        System.out.println(result);
    }
}
