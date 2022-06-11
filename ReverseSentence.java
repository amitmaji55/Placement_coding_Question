package com.company;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int lastindex = str.lastIndexOf(' ');
        String surname = str.substring(lastindex+1);
        String initial = str.substring(0,lastindex);
        System.out.println(surname +"  "+initial);
    }
}
