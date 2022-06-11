package com.company;

public class Frequency_arrayElement {
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,30,30,40};
        boolean[] visited = new boolean[8];
        for (int i=0;i<arr.length;i++)
        {
            if(visited[i]==true)
               continue;
            int count = 0;
            for (int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    visited[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i]+" "+count);
        }

    }
}
