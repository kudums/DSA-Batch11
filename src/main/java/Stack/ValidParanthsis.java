package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthsis {

    boolean isValid(String s)
    {
        Stack<Character> st=new Stack<>();

        if(s.length() == 0 || s.length()%2 != 0)
        {
            System.out.println("Invalid");
            return false;
        }
        //}[]{
        if(s.charAt(0) == '}' ||
                s.charAt(0) == ')' ||
                s.charAt(0) == ']' )
        {
            System.out.println("Invalid");
            return false;
        }
        //{{{[[[
        for( int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' ||
                    s.charAt(i) == '[' ||
                    s.charAt(i) == '{' )
            {
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')')
            {
                if(!st.isEmpty() && st.peek() == '(')
                {
                    st.pop();
                }
                else
                {
                    System.out.println("Invalid");
                    return false;
                }
            }
            if(s.charAt(i) == '}')
            {
                if(!st.isEmpty() && st.peek() == '{')
                {
                    st.pop();
                }
                else
                {
                    System.out.println("Invalid");
                    return false;
                }
            }
            if(s.charAt(i) == ']')
            {
                if(!st.isEmpty() && st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                    System.out.println("Invalid");
                    return false;
                }
            }
        }

     return st.isEmpty();
    }

    public static void main(String[] args)
    {
        ValidParanthsis vl=new ValidParanthsis();

        Scanner sc=new Scanner(System.in);
        String s= sc.next();
       boolean result= vl.isValid(s);

     System.out.println(s + "is Valid : "+ result );

    }
}
