import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      Map<String,Integer> find=new HashMap<String,Integer>();
      int N=in.nextInt();
      in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         find.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(find.containsKey(s))
             System.out.println(s+"="+find.get(s));
         else System.out.println("Not found");
      }
   }
}
