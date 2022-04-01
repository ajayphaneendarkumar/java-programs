import java.io.*;
public class Season{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      int n,sum=0,product=1,diff;
      n=Integer.parseInt(br.readLine());
      for(int i=1;i<=n;i++)
      {
          
          if(n%i==0)
          {
          sum=sum+i;
          product=product*i;
          }
      }
      diff=product-sum;
      System.out.println("difference="+diff);
    }
}