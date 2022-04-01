import java.io.*;
public class Primes
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int n=2,count;
        n=Integer.parseInt(br.readLine());
        while(n<=100)
        {
            count=0;
          for(int i=1;i<=n;i++)
          {
             if(n%i==0)
             {
               count++;
             }
          }
          if(count==2)
          {
              System.out.println(n+"");
          }
          n++;
          
        }
    }
}