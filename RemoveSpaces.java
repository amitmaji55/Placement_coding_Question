package com.company;
import java.util.Scanner;
public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string :  " );
        String s1 = sc.nextLine();
        String s2 = s1.replaceAll("\\s+", "");
        System.out.println("Input String : "+s1);
        System.out.println("Input String Without Spaces : "+s2);

    }

}
