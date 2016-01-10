import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner kbd=new Scanner(System.in);
        int t=kbd.nextInt();
        while(t-- > 0)
            {
        int a=kbd.nextInt();
        int b=kbd.nextInt();
        int N=kbd.nextInt();
        double i,term,sum=a;
            int ans;
        for(i=0;i<N;i++)
            {
             term = Math.pow(2,i)*b;
             sum = sum + term;
             ans = (int)sum;
            System.out.print(ans+" ");
        }
            System.out.println();
        }
        
    }
}
