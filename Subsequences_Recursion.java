package com.company;

import java.util.ArrayList;

public class Subsequences_Recursion {
    public static void ps(int[] arr, int i, ArrayList<Integer> ds)
    {
        if(i==arr.length)
        {
            if(ds.size()>0)
                System.out.println(ds);
        }
        else{
            ps(arr,i+1,ds);
            ds.add(arr[i]);
            ps(arr,i+1,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> ds = new ArrayList<>();
        ps(arr,0,ds);
    }
}
