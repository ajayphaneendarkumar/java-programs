import java.io.*;
public class Palindromenumber{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      int n,d,temp,rem,sum=0;
      n=Integer.parseInt(br.readLine());
        // d=(int)Math.log10(n)+1;
      //System.out.println("number of digits:"+d);
      temp=n;
      while(n>0)
      {
        rem=n%10;
        //sum=sum+(int)Math.pow(remainder,d
        sum=sum*10+rem;
        n=n/10;
        
      }
      if(sum==temp)
      {
          System.out.println(temp +"is palindrome number");
          
      }
      else
      {
          System.out.println(temp+"is not palindrome number");
      }
    }
}