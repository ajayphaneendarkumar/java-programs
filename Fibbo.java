import java.io.*;
public class Fibbo{
    public static void main(String args[])throws Exception {
      InputStreamReader r=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(r);
      int n,n1=0,n2=1,n3;
      n=Integer.parseInt(br.readLine());
       System.out.println(n1+""+n2);
      for(int i=0;i<n;i++)
      {
          n3=n1+n2;
         System.out.println(n3); 
          n1=n2;
          n2=n3;
      }
    }
}