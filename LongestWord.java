package com.company;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String : ");
        String str = sc.nextLine();
        String word = "";
        String longest="";
        str=str+' ';
        int l = str.length();
        for (int i =0;i<l;i++) {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                word= word+ch;
            }
            else{
                if(word.length()>longest.length())
                {
                    longest=word;
                    word="";
                }
            }
        }
        System.out.println("The longest word is : "+longest.length()+" "+longest);
    }
}

