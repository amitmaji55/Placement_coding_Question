package com.company;

import java.util.Scanner;
public class RevSen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        str = " " + str;
        String word = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                System.out.print(word + " ");
                word = "";
            } else {
                word = ch + word;
            }
        }
    }
}
