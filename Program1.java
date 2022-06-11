package com.company;
import java.util.Scanner;
public class Program1 {
    public static void main(String args[]) {
        String seven_wonders[] = {"CHICHEN ITZA", "CHRIST THE REDEEMER", "TAJMAHAL",
                "GREAT WALL OF CHINA", "MACHU PICCHU", "PETRA", "COLOSSEUM"};
        String location[] = {"MEXICO", "BRAZIL", "INDIA", "CHINA", "PERU", "JORDAN",
                "ITALY"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the country:  ");
        String ch = sc.nextLine();
        ch = ch.toUpperCase();
        int flag=-1;
        int l = location.length;
        for (int i = 0; i < l; i++) {
            if (location[i].equals(ch)) {
                System.out.println(location[i] + " --> " + seven_wonders[i]);
                flag = 1;
                break;
            }
        }
              if(flag==0)
                System.out.println("Sorry Not Found!");
    }
}

