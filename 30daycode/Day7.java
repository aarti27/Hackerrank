import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        int i;
        for(i=0; i < N; i++)
            arr[i] = in.nextInt();
            
        for( i=0;i<N;i++)
            System.out.print(arr[N-i-1]+" ");
        
    }
}
