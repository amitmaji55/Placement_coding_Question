package com.company;

public class TargetSum {
     static int[] target(int[] arr,int target)
    {
        for (int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                    return new int[]{i+1,j+1};
            }
            return new int[] {-1,-1};
    }

    public static void main(String[] args) {
         int[] arr = {2,7,11,15};
         int target = 9;
       for (int x: target(arr,target))
           System.out.println(x+" ");

    }
}
