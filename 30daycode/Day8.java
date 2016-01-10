import java.util.*;
import java.io.*;

class Solution{
public static void main(String []argh)
{
  Scanner in = new Scanner(System.in);
  String s;
  int N=in.nextInt();
  Map<String,String> phonenum=new HashMap<String,String>();
  in.nextLine();
  for(int i=0;i<N;i++)
  {
     String name=in.nextLine();
     String phone=in.nextLine();
     phonenum.put(name,phone);
  }
  while(true){
       s=in.nextLine();
       if(s==null)
       {
           break;
       }
       else
       {
           if(phonenum.get(s)!=null)
           {
               String a=new StringBuilder(s).append("=").append(phonenum.get(s)).toString();
               System.out.println(a);
           }
           else
           {
           System.out.println("Not found");
           }
       }
   }
}
}
