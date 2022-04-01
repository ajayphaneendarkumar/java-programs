import java.io.*;
public class SumFibbo{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      int n,n1=0,n2=1,n3,sum=0;
      n=Integer.parseInt(br.readLine());
       System.out.println(n1+""+n2);
       n3=n1+n2;
      while(n3<=n)
      {
           n1=n2;
          n2=n3;
         System.out.println(n3);
           n3=n1+n2;
           if(n3%2==0)
           {
               sum=sum+n3;
           }
          
         
      }
      System.out.println("sum of even terms is :"+sum);
    }
}