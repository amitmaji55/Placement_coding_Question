package com.company;
import java.util.Scanner;
import java.util.Stack;
public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> ob = new Stack<Character>();
        for (int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ob.empty())
            {
                ob.push(ch);
            }
            else if(ch=='{' || ch=='[' || ch=='(')
            {
                ob.push(ch);
            }
            else if (ch=='}' && ob.peek()=='{'){
                ob.pop();
            }
            else if (ch==']' && ob.peek()=='['){
                ob.pop();
            }
            else if (ch==')' && ob.peek()=='('){
                ob.pop();
            }
        }
        if(ob.empty())
        {
            System.out.println("Well Formed");
        }
        else
            System.out.println("Not Well Formed");
    }
}
