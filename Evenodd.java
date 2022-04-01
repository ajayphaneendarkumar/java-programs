import java.io.*;
public class Evenodd{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      int n,s1=0,s2=0,diff,rem;
      n=Integer.parseInt(br.readLine());
      while(n>0)
      {
           rem=n%10;
          if(rem%2==0)
          {
              s1=s1+rem;
          }
          else
          {
              s2=s2+rem;
          }
          n=n/10;
      }
      diff=Math.abs(s1-s2);
      System.out.println("difference is :"+diff);
      
    }
}